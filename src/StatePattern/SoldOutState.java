package StatePattern;

/**
 * @author yunfeng.zang
 * @createTime 2017年4月10日下午6:38:24 售罄
 */
public class SoldOutState implements State {
	GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("没有糖果");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("没有糖果");
	}

	@Override
	public void trunCrank() {
		System.out.println("没有糖果");
	}

	@Override
	public void dispense() {
		System.out.println("没有糖果");

	}

}
