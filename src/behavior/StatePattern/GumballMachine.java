package behavior.StatePattern;

public class GumballMachine {

	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State soldOutState;
	State winnerState;

	State state = noQuarterState;
	int count = 0;
	int rale = 0;

	public GumballMachine(int numberGumballs, int rale) {
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		soldOutState = new SoldOutState(this);
		winnerState = new WinnerState(this);
		this.count = numberGumballs;
		this.rale = rale;
		if (numberGumballs > 0) {
			state = noQuarterState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void trunCrank() {
		state.trunCrank();
	}

	public void dispense() {
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}

	void releaseBall() {
		if (count > 0)
			count--;
		System.out.println("减少一个糖果,还剩下" + count);
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getWinnerState() {
		return winnerState;
	}

	public void setWinnerState(State winnerState) {
		this.winnerState = winnerState;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getRale() {
		return rale;
	}

	public void setRale(int rale) {
		this.rale = rale;
	}

}
