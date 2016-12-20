package ReflectDome;

import ReflectDome.Dao.impl.Toast;

public class DynamicDome {
	public static void main(String[] args) {
		// 运行时动态加载
		try {
			Toast t = new Toast(1.2);
			// Class<?> c3 = Class.forName(args[0]);
			Class<?> c3 = Class.forName("ReflectDome.Dao.impl.Toast");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
