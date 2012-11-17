package zju.lzq.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;

import junit.framework.TestCase;

import org.junit.Test;

public class TestDomainEquals extends TestCase {

	@Test
	public void testAssertEquals() {
		assertEquals(false, DomainEquals.assertEquals("a", "c"));

		List<Integer> list1 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(2);
		assertEquals(true, DomainEquals.assertEquals(list1, list1));

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		assertEquals(false, DomainEquals.assertEquals(list1, list2));

		List<Integer> list3 = new LinkedList<Integer>();
		list3.add(1);
		list3.add(2);
		assertEquals(true, DomainEquals.assertEquals(list1, list3));

		List<Integer> list4 = new LinkedList<Integer>();
		list4.add(1);
		list4.add(3);
		assertEquals(false, DomainEquals.assertEquals(list1, list4));

		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("a", "aa");
		map1.put("b", "bb");

		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("a", "aa");
		map2.put("b", "bb");
		assertEquals(true, DomainEquals.assertEquals(map1, map2));

		Map<String, String> map3 = new LinkedHashMap<String, String>();
		map3.put("a", "aa");
		map3.put("b", "bb");

		Map<String, String> map4 = new LinkedHashMap<String, String>();
		map4.put("a", "aa");
		map4.put("b", "bb");
		assertEquals(true, DomainEquals.assertEquals(map3, map4));

		Map<String, String> map5 = new WeakHashMap<String, String>();
		map5.put("a", "aa");
		map5.put("b", "bb");

		Map<String, String> map6 = new WeakHashMap<String, String>();
		map6.put("a", "aa");
		map6.put("b", "bb");
		assertEquals(true, DomainEquals.assertEquals(map5, map6));

		Map<String, String> map7 = new IdentityHashMap<String, String>();
		map7.put("a", "aa");
		map7.put("b", "bb");

		Map<String, String> map8 = new IdentityHashMap<String, String>();
		map8.put("a", "aa");
		map8.put("b", "bb");
		assertEquals(true, DomainEquals.assertEquals(map7, map8));

		Map<String, String> map9 = new TreeMap<String, String>();
		map9.put("a", "aa");
		map9.put("b", "bb");

		Map<String, String> map10 = new TreeMap<String, String>();
		map10.put("a", "aa");
		map10.put("b", "bb");
		assertEquals(true, DomainEquals.assertEquals(map9, map10));
	}

}
