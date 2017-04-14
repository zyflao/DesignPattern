package jdk5;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
	public static void main(String[] args) {
		// 泛型，即“参数化类型”。String类型添加int类型 会报错
		// List<String> list = new ArrayList();
		List list = new ArrayList();
		list.add("qqyumidi");
		list.add("corn");
		list.add(100);

		for (int i = 0; i < list.size(); i++) {
			String name = (String) list.get(i); // 1
			System.out.println("name:" + name);
		}
	}
}