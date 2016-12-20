package ReflectDome;

import java.math.BigDecimal;

import ReflectDome.Dao.ReflectFood;

public class MileDao implements ReflectFood {
	double costPer = 1.2;

	@Override
	public double cost(double weight) {
		// TODO Auto-generated method stub
		double f = costPer * weight;
		BigDecimal b = new BigDecimal(f);
		double f1 = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		return f1;
	}

	public void printTest(String s1, int s2) {
		System.out.println(":" + s1 + s2);
	}

	public void printTest(int s2) {
		System.out.println(":" + s2);
	}

	public void printTest(String s2) {
		System.out.println(":" + s2);
	}

}
