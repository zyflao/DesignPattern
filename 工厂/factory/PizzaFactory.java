package factory;

import factory.pizza.HaiXian;
import factory.pizza.Pizza;
import factory.pizza.ShiJin;

public class PizzaFactory {
	public Pizza pizzaCreat(String type) {
		Pizza pizza = null;
		if (type.equals("ShiJin")) {
			pizza = new ShiJin();
		} else if (type.equals("HaiXian")) {
			pizza = new HaiXian();
		}
		return pizza;
	}
}
