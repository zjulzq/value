package zju.lzq.util;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class DomainEquals {
	private static Logger log = Logger.getLogger(DomainEquals.class);

	public static boolean assertEquals(Object source, Object target) {

		if (source == null && target == null) {
			return true;
		} else if (source == null || target == null) {
			return false;
		}

		if (!source.getClass().equals(target.getClass())) {
			return false;
		}

		if (isWarp(source.getClass())) {
			return judgeWrap(source, target);
		}

		if (source instanceof Map<?, ?>) {
			return judgeMap(source, target);
		}

		if (source instanceof List<?>) {
			return judgeList(source, target);
		}

		return judgeOther(source, target);
	}

	private static boolean judgeOther(Object source, Object target) {
		PropertyDescriptor[] properties = getProperties(source.getClass());
		for (PropertyDescriptor property : properties) {
			Method method = property.getReadMethod();
			try {
				if (property.getPropertyType() == Class.class) {
					// ignore
				} else if (property.getPropertyType() == String.class) {
					if (!method.invoke(source, new Object[] {}).equals(method.invoke(target, new Object[] {}))) {
						return false;
					}
				} else if (isWarp(property.getPropertyType())) {
					if (!method.invoke(source, new Object[] {}).toString()
							.equals(method.invoke(target, new Object[] {}).toString())) {
						return false;
					}
				} else {
					return assertEquals(method.invoke(source, new Object[] {}), method.invoke(target, new Object[] {}));
				}
			} catch (Exception e) {
				e.printStackTrace();
				log.warn("fail to compare source and target", e);
			}
		}
		return true;
	}

	private static boolean judgeWrap(Object source, Object target) {
		return source.toString().equals(target.toString());
	}

	private static boolean isWarp(Class<?> clazz) {
		try {
			return ((Class<?>) clazz.getField("TYPE").get(null)).isPrimitive();
		} catch (Exception e) {
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	private static boolean judgeMap(Object source, Object target) {
		Map<Object, Object> sourceMap = (HashMap<Object, Object>) source;
		Map<Object, Object> targetMap = (HashMap<Object, Object>) target;
		if (sourceMap.size() != targetMap.size()) {
			return false;
		}

		for (Object key : sourceMap.keySet()) {
			Object sourceValue = sourceMap.get(key);
			Object targetValue = targetMap.get(key);
			boolean flag = assertEquals(sourceValue, targetValue);
			if (!flag) {
				return false;
			}
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	private static boolean judgeList(Object source, Object target) {
		List<Object> sourceList = (ArrayList<Object>) source;
		List<Object> targetList = (ArrayList<Object>) target;
		if (sourceList.size() != targetList.size()) {
			return false;
		}

		for (int i = 0; i < sourceList.size(); ++i) {
			Object sourceValue = sourceList.get(i);
			Object targetValue = targetList.get(i);
			boolean flag = assertEquals(sourceValue, targetValue);
			if (!flag) {
				return false;
			}
		}
		return true;
	}

	private static PropertyDescriptor[] getProperties(Class<?> clazz) {
		PropertyDescriptor[] properties = null;
		try {
			properties = Introspector.getBeanInfo(clazz).getPropertyDescriptors();
		} catch (IntrospectionException e) {
			e.printStackTrace();
			log.warn("fail to get properties", e);
		}
		return properties;
	}

}
