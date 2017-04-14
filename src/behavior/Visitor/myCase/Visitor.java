package behavior.Visitor.myCase;

public class Visitor {
	Role[] roles;

	public Visitor() {
		roles = new Role[] { new Boss(), new Admin() };
	}

	void getRoles(WinApi wa) {
		for (Role role : roles) {
			role.win(wa);
		}
	}
}
