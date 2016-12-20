package ReflectDome;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;

import ReflectDome.Dao.ReflectFood;

public class ToastDao implements ReflectFood {
	double costPer;

	public ToastDao(double costPer) {
		this.costPer = costPer;
	}

	@Override
	public double cost(double weight) {
		// TODO Auto-generated method stub
		double f = costPer * weight;
		BigDecimal b = new BigDecimal(f);
		double f1 = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		return f1;
	}

	public static void main(String[] args) throws NoSuchMethodException,
			SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException,
			InstantiationException {
		try {
			System.out.println(args[0]);
			Class<?> c3 = Class.forName(args[0]);
			ReflectFood rf = (MileDao) c3.newInstance();

			double f = rf.cost(1.1);
			System.out.println(f);
			Method m = c3.getMethod("printTest", String.class, int.class);
			Method m2 = c3.getMethod("printTest", String.class);
			m2.invoke(rf, String.valueOf(1));
			m.invoke(rf, new Object[] { "123", 1 });
			m.invoke(rf, "123", 1);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
