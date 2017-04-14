package behavior.Visitor.myCase;

public interface WinApi {
	void win(User u);

	void win(Admin u);

	void win(Boss u);

	void win(Service u);
}
