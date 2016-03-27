package factory;

import factory.pizza.Pizza;

public class PizzaStore {
    PizzaFactory pFactory;
	public PizzaStore(PizzaFactory pFactory){
	this.pFactory= pFactory;
	}
	public  Pizza makePizza(String type){
		Pizza P;
	    P=pFactory.pizzaCreat(type);
		P.Hi();
		P.Shu();
	return P;
	}
	public static void main(String[] args) {
		PizzaStore pizzaStore =new PizzaStore(new PizzaFactory());
		pizzaStore.makePizza("ShiJin");
	}
}
