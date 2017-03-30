package FactoryMethod;

public class BenzDriver extends Driver {

	@Override
	public ICar DriverCar() {
		// TODO Auto-generated method stub
		return new BenzCar();
	}

}
