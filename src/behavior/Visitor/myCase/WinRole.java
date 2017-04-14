package behavior.Visitor.myCase;

public class WinRole implements WinApi {
	public void win(User u) {
		System.out.println("User 得到奖励");
	}

	public void win(Admin u) {
		System.out.println("Admin 得到奖励");
	}

	public void win(Service u) {
		System.out.println("Service 得到奖励");
	}

	public void win(Boss u) {
		System.out.println("Boss 得到奖励");
	}
}
