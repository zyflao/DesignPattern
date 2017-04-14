package FactoryMethod;

public class BenzDriver implements IDriver {

	@Override
	public IBusinessCar BusinessCarDriver() {
		// TODO Auto-generated method stub
		return new BenzBusinessCar();
	}

	@Override
	public ISportCar SportCarDriver() {
		// TODO Auto-generated method stub
		return new BenzSportCar();
	}

}
