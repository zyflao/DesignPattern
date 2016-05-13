package factory;

import factory.pizza.Pizza;

public   class PizzaFactory {
	public static <T extends Pizza> T createPizza(Class<T> c){
		Pizza p=null;
			try {
				p=(T)Class.forName(c.getName()).newInstance();
			} catch (Exception e) {
				System.out.println("创建错误");
				e.printStackTrace();
			}
		return (T) p;
	}

}
