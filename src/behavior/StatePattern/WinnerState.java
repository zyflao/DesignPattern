package behavior.StatePattern;

/**
 * @author yunfeng.zang
 * @createTime 2017年4月10日下午6:38:52 中奖了
 */
public class WinnerState implements State {
	GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("已经投币");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("已经投币退回");

	}

	@Override
	public void trunCrank() {
		System.out.println("已经拉动");
	}

	@Override
	public void dispense() {
		System.out.println("中奖了额外给一个");
		gumballMachine.releaseBall();
		gumballMachine.releaseBall();
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
}
