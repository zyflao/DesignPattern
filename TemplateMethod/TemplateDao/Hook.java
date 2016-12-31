package TemplateDao;

import service.main;

public abstract class Hook {
	abstract void wash();

	void doSomthing() {
		wash();
		eatFood();// 只会读取子类的方法。影响了父类
	}

	void eatFood() {
		System.out.println("Eat Hot pot！");
	}

	public static void main(String[] args) {
		A a = new A();
		a.doSomthing();
	}
}

class A extends Hook {

	@Override
	void eatFood() {
		System.out.println("eat Bread！");
	}

	@Override
	void wash() {
		System.out.println("wash");

	}
}