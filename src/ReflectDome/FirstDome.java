package ReflectDome;

public class FirstDome {
	public static void main(String[] args) {

		double d = 1.2;
		ToastDao foo1 = new ToastDao(d);
		// 类类型（class type）
		Class<ToastDao> c1 = ToastDao.class;
		Class<? extends ToastDao> c2 = foo1.getClass();
		System.out.println(c1 == c2);
		System.out.println();

		try {
			// 动态加载
			Class<?> c3 = Class.forName("ReflectDome.Dao.impl.Toast");
			System.out.println(c3 == c2);
			ToastDao food3 = (ToastDao) c3.newInstance();
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
