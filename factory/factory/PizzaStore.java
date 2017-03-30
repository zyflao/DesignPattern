package factory;

import factory.pizza.HaiXianl;
import factory.pizza.Pizza;
import factory.pizza.ShiJind;

public class PizzaStore {
	PizzaFactory pFactory;

	public PizzaStore(PizzaFactory pFactory) {
		this.pFactory = pFactory;
	}

	public <T extends Pizza> T makePizza(Class<T> c) {
		Pizza p = null;
		try {
			p = (T) Class.forName(c.getName()).newInstance();
			p.ag();
			p.Shu();
			p.Hi();
		} catch (Exception e) {
			System.out.println("创建错误");
			e.printStackTrace();
		}
		return null;

	}

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

		/*
		 * PizzaStore1 pizzaStore2 =new PizzaStore1(); Pizza p =
		 * pizzaStore2.makePizza1(HaiXianl.class); p.Shu(); p.ag(); p.size();
		 */
		/* 抽象工厂 */
		CreatPizzaa_AbstractFactor f = new BigPizzaFactory();
		CreatPizzaa_AbstractFactor fl = new LittlePizzaFactory();
		fl.doPizza(ShiJind.class);
		fl.doPizza(HaiXianl.class);
	}
}
