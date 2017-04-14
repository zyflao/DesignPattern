package jdk5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AutoboxingAndUnboxing {

	private static void xiangYuan() {
		Integer iObj = 3;
		System.out.println(iObj + 12);
		Integer i1 = 137;// (-128--127范围时，为true);
		Integer i2 = 137;// (-128--127范围时，为true);
		System.out.println(i1 == i2); // false，但是括号中时却返回ture，原因是Integer采用的是享元模式
		Integer i3 = Integer.valueOf(213);
		Integer i4 = Integer.valueOf(213);
		System.out.println(i3 == i4);// 同上，另一种包装形式

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer i = 1; // 装箱
		int j = i;// 拆箱

		// 典型应用
		// 装箱
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);

		// 拆箱
		Iterator it = list.iterator();
		while (it.hasNext()) {
			int k = (Integer) it.next();
			System.out.println(k);
		}
	}

}
