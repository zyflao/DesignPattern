package ReflectDome.Dao.impl;

import java.math.BigDecimal;

import ReflectDome.Dao.Food;

public class Toast implements Food {
	double costPer;// 块钱一斤

	public Toast(double costPer) {
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
}
