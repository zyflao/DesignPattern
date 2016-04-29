package factory;

import factory.pizza.Pizza;

public class LittlePizzaFactory implements CreatPizzaa_AbstractFactor{
	private static String size = "little";
	@Override
	public <T extends Pizza> T  doPizza(Class<T> p) {
		Pizza pi = null;
		try {
			pi=(Pizza)Class.forName(p.getName()).newInstance();
			pi.size(size);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return (T)pi;
	}

	
	
}
