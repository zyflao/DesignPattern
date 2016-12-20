package ReflectDome;

import ReflectDome.Food;
import ReflectDome.Dao.impl.Toast;

public class FirstDome {
	public static void main(String[] args) {
		Food foo1 = new Food();
		double d = 1.2;
		Toast t = new Toast(d);
		// 类类型（class type）
		Class<Food> c1 = Food.class;
		Class<? extends Food> c2 = foo1.getClass();
		System.out.println(c1 == c2);
		System.out.println();

		try {
			// 动态加载
			Class<?> c3 = Class.forName("ReflectDome.Dao.impl.Toast");
			c3 = Class.forName("ReflectDome.Food");
			System.out.println(c3 == c2);
			Food food3 = (Food) c3.newInstance();
			System.out.println(food3.getClass() == foo1.getClass());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
