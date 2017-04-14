package behavior.Visitor.myCase;

public class Admin implements Role {

	@Override
	public void win(WinApi wa) {
		wa.win(this);
	}

}
