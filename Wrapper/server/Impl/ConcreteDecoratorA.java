package server.Impl;

import server.Component;


public class ConcreteDecoratorA extends Decorator {


	public ConcreteDecoratorA(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dosomting() {
		// TODO Auto-generated method stub
		super.dosomting();
		System.out.println("发邮件！");
	}
	public static void main(String[] args) {
		ConcreteComponent component = new ConcreteComponent();
		ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(component);
		concreteDecoratorA.dosomting();
	}
	
}