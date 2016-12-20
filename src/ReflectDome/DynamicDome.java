package ReflectDome;

public class DynamicDome {
	public static void main(String[] args) {
		// 运行时动态加载
		try {

			// Class<?> c3 = Class.forName(args[0]);
			Class<?> c3 = Class.forName("ReflectDome.Dao.impl.Toast");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
