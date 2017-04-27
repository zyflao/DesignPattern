package behavior.StatePattern;

public class Dirctor {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5, 1);

		gumballMachine.insertQuarter();
		gumballMachine.trunCrank();
		gumballMachine.dispense();

		gumballMachine.insertQuarter();
		gumballMachine.trunCrank();
		gumballMachine.dispense();

		gumballMachine.insertQuarter();
		gumballMachine.trunCrank();
		gumballMachine.dispense();

	}
}
