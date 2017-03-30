package factory;

import factory.pizza.HaiXianl;
import factory.pizza.Pizza;

public class Test {

	public static void main(String[] args) {
		/*
		 * PizzaStore pizzaStore =new PizzaStore(new PizzaFactory());
		 * pizzaStore.makePizza(ShiJind.class);
		 */

		/* 工厂方法 */
		PizzaFactory pizzaStore1 = new PizzaFactory();

		@SuppressWarnings("static-access")
		Pizza p = pizzaStore1.createPizza(HaiXianl.class);
		p.Shu();
		p.ag();
	}
}
