package FactoryMethod;

public class BMWDriver extends Driver {

	@Override
	public ICar DriverCar() {
		// TODO Auto-generated method stub
		return new BMWCar();
	}

}
