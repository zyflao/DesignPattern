package AbstractFactory;

public class AbstractFactoryTest {
	public static void main(String[] args) {

		IDriver iDriver = new BenzDriver();
		ISportCar myCar = iDriver.SportCarDriver();
		myCar.run();

		IBusinessCar ib = iDriver.BusinessCarDriver();
		ib.run();
	}
}
