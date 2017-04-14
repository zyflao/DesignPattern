package jdk7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author yunfeng.zang
 * @createTime 2017年4月12日下午5:03:13
 */

public class Test {
	char a = 'a';
	char b = 'b';
	String s = "abc";
	String s1 = "abc";

	String s2 = new String("abc");

	private boolean commperaChar() {
		return s == s2;

	}

	// 运用List<String> tempList = new ArrayList<>(); 即泛型实例化类型自动推断
	private void listTest() {
		// TODO Auto-generated method stub
		List<String> tempList = new ArrayList<>();
		tempList.add(0, s);
		tempList.add(1, "1");
		tempList.add(2, "2");
		tempList.set(2, "s1");
		for (int i = 0; i < tempList.size(); i++) {
			System.out.println(tempList.get(i));
		}
		// 底层也是用迭代器模式 如果只读数据用这个，效率高比for循环！因为游标自动记录遍历位置
		for (String s : tempList) {
			System.out.println(s);
		}
		// 三种便利方式
		Iterator<String> iterator = tempList.iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
		}

	}

	/**
	 * switch中可以使用字串了
	 */
	public void swithTest() {

		String s = "1";
		switch (s) {
		case "quux":
			System.out.println("quux");
			break;
		case "foo":
			System.out.println("bar");
			break;
		case "bar":
			System.out.println("bar");
			break;
		case "baz":
			System.out.println("baz");
			break;
		default:
			System.out.println("default");
		}
	}

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.commperaChar());
		t.swithTest();
		t.listTest();
	}
}
