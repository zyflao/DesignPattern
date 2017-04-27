package behavior.StatePattern;

import java.util.Random;

/**
 * @author yunfeng.zang
 * @createTime 2017年4月10日下午6:38:34 分发糖果
 */
public class SoldState implements State {
	GumballMachine gumballMachine;

	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("已经投币");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("已经 拉动了摇杆，无法退币");

	}

	@Override
	public void trunCrank() {
		System.out.println("已经拉动了,请等待");

	}

	@Override
	public void dispense() {
		System.out.println("SoldState");
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
			gumballMachine.releaseBall();
		} else {
			gumballMachine.setState(gumballMachine.getSoldOutState());
			System.out.println("SoldOutState");
		}
	}
}
