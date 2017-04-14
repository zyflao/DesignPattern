package collection.set.hashset;

import java.util.Iterator;

/**
 * @author yunfeng.zang
 * @createTime 2017年4月14日上午11:26:48
 *             HashSet是Set接口的一个子类，主要的特点是：里面不能存放重复元素，而且采用散列的存储方法，
 *             所以没有顺序。这里所说的没有顺序是指：元素插入的顺序与输出的顺序不一致。
 */
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();

		set.add("a");
		set.add("b");
		set.add("c");
		set.add("c");
		set.add("d");

		// 使用Iterator输出集合
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		// 使用For Each输出结合
		for (String e : set) {
			System.out.print(e + " ");
		}
		System.out.println();

		// 使用toString输出集合
		System.out.println(set);
	}
}