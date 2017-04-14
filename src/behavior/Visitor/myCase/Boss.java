package behavior.Visitor.myCase;

public class Boss implements Role {

	@Override
	public void win(WinApi wa) {
		wa.win(this);
	}
}
