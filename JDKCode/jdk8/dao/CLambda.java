package jdk8.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * lambda
 */
public class CLambda {
	public static List<String> names = Arrays.asList("311", "213", "14", "45");

	// before jdk8.
	public void sortString(List<String> names) {

		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return a.compareTo(b);
			}
		});
	}

	public void lambdaSort(List<String> names) {
		names.sort((String a, String b) -> a.compareTo(b));
	}

	/*
	 * forEach map.
	 */
	public void lambdaMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "2");
		map.put("2", "3");
		map.put("3", "4");

		map.forEach((k, v) -> {
			System.out.println("Item : " + k + " Count : " + v);
			if ("1".equals(k)) {
				System.out.println("Hello 1");
			}
		});
	}

	/*
	 * forEach list.
	 */
	public void lambdaList() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(2);
		list.add(3);
		list.add(5);

		list.forEach(System.out::println);
		// sort
		list.sort((Integer h1, Integer h2) -> h1.compareTo(h2));

		list.forEach(l -> {
			System.out.println("sort after:" + l);
		});

		list.forEach(l -> {
			System.out.println("value : " + l);
			if ("11".equals(l)) {
				System.out.println("Hello " + l);
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new CLambda().sortString(names);
		new CLambda().lambdaSort(names);

		// Collections.sort(names, (a, b) -> a.compareTo(b));
		names.forEach(System.out::println);

		new CLambda().lambdaList();
	}
}
