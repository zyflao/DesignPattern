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

	public List<Integer> names = Arrays.asList(311, 213, 14, 45);

	// before jdk8.
	public List sortString(List<Integer> names) {
		User user1 = new User();
		user1.setName("a");
		user1.setOrder(1);
		User user2 = new User();
		user2.setName("b");
		user2.setOrder(5);
		List<User> list = new ArrayList<User>();
		list.add(user2);
		list.add(user1);
		Collections.sort(list, new Comparator<User>() {
			public int compare(User arg0, User arg1) {
				return arg0.getOrder().compareTo(arg1.getOrder());
			}
		});
		for (User u : list) {
			System.out.println(u.getOrder());
		}
		return list;
	}

	public void lambdaSort(List<Integer> names) {
		names.sort((Integer a, Integer b) -> a.compareTo(b));
	}

	public void lambdaSortUser(List<User> names) {

		names.sort((User a, User b) -> b.getOrder().compareTo(a.getOrder()));
		names.forEach(obj -> System.out.println("" + obj.toString()));
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
			if ("3".equals(k)) {
				System.out.println("Hello " + k);
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

		list.forEach(obj -> System.out.println("haha:" + obj.toString()));

		list.forEach(System.out::println);
		// sort
		list.sort((Integer h1, Integer h2) -> h1.compareTo(h2));

		list.forEach(l -> {
			System.out.println("sort after:" + l);
		});

		list.forEach(l1 -> {
			if (11 == l1) {
				System.out.println("Hello " + l1);
			}
		});
	}

	public static void main(String[] args) {
		User user1 = new User();
		user1.setName("a");
		user1.setOrder(1);
		User user2 = new User();
		user2.setName("b");
		user2.setOrder(5);
		List<User> list = new ArrayList<User>();
		list.add(user2);
		list.add(user1);

		// TODO Auto-generated method stub
		// new CLambda().sortString(names);
		CLambda lambda = new CLambda();
		List<Integer> l = lambda.sortString(lambda.names);
		System.out.println(l.toString());

		lambda.lambdaSort(lambda.names);

		lambda.names.forEach(System.out::println);

		lambda.lambdaSortUser(list);
		lambda.lambdaList();
	}
}
