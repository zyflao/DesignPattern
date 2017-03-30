package FactoryMethod;

public class FactoryMethodTest {

	public static void main(String[] args) {
		// 工厂方法创建对象延迟到子类 创建
		Driver myDriver = new BenzDriver();

		ICar myCar = myDriver.DriverCar();

		myCar.run();
	}

}
