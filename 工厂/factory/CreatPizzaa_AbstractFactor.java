package factory;

import factory.pizza.Pizza;

public interface CreatPizzaa_AbstractFactor {
	
	public <T extends Pizza> T doPizza(Class<T> p);
	
}
