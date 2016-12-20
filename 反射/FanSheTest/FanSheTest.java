package FanSheTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import FanSheDao.EatFood;
public class FanSheTest {
	public static void main(String[] args) {
		EatFood eatFood=new EatFood();
	      System.out.println(eatFood.getClass().getName());
	      
	      try {
			Class<?> demo=Class.forName("FanSheDao.EatFood");
			//invoke
			Object o = demo.newInstance();
			Method m = demo.getMethod("eat", String.class);
			for (int i = 0; i < 16;i++) {
				m.invoke(o, String.valueOf(i));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      
	}
}
