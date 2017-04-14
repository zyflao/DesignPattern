package behavior.Visitor.myCase;

public class Service implements Role {

	@Override
	public void win(WinApi wa) {
		wa.win(this);
	}

}
