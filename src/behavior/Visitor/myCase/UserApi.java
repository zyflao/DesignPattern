package behavior.Visitor.myCase;

public interface UserApi {
	void win(User use);

	void win(Admin use);

	void win(Boss use);

	void win(Service use);
}
