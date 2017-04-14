package FactoryMethod;

public class BMWDriver implements IDriver {

	@Override
	public IBusinessCar BusinessCarDriver() {
		// TODO Auto-generated method stub
		return new BMWBusinessCar();
	}

	@Override
	public ISportCar SportCarDriver() {
		// TODO Auto-generated method stub
		return new BMWSportCar();
	}

}
