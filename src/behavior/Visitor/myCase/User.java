package behavior.Visitor.myCase;

public class User implements Role {

	@Override
	public void win(WinApi wa) {
		wa.win(this);
	}

}
