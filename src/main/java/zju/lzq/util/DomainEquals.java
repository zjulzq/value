package zju.lzq.util;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

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

		Class<?> clazz = source.getClass();
		PropertyDescriptor[] properties = getProperties(clazz);

		if (!judgeWrap(source, target, clazz)) {
			return false;
		}

		for (PropertyDescriptor property : properties) {
			Method method = property.getReadMethod();
			try {
				if (property.getPropertyType() == Class.class) {
					// ignore
				} else if (property.getPropertyType() == String.class) {
					if (!method.invoke(source, new Object[] {}).equals(method.invoke(target, new Object[] {}))) {
						return false;
					}
				} else if (property.getPropertyType().getDeclaredFields().length == 0) {
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

	private static boolean judgeWrap(Object source, Object target, Class<?> clazz) {
		boolean result = true;
		if (isWarp(clazz)) {
			if (!source.toString().equals(target.toString())) {
				result = false;
			}
		}
		return result;
	}

	private static boolean isWarp(Class<?> clazz) {
		try {
			return ((Class<?>) clazz.getField("TYPE").get(null)).isPrimitive();
		} catch (Exception e) {
			return false;
		}
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
