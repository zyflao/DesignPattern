package behavior.Visitor.myCase;

public class UserTest {
	public static void main(String[] args) {

		Visitor visitor = new Visitor();

		visitor.getRoles(new WinRole());
	}
}
