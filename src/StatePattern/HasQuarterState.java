package StatePattern;

import java.util.Random;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;

	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("has insert ");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("硬币退出");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void trunCrank() {
		System.out.println("you trunCrank");
		Random ran = new Random();
		int i = ran.nextInt(gumballMachine.getRale()) + 1;
		if (i == gumballMachine.getRale() && gumballMachine.getCount() > 1) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else if (gumballMachine.getCount() == 0) {
			System.out.println("退您钱");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}

	}

	@Override
	public void dispense() {
		System.out.println("no this dispensed");

	}

}
