package AbstractFactory;

public interface IDriver {
	IBusinessCar BusinessCarDriver();

	ISportCar SportCarDriver();
}
