package behavior.Visitor.myCase;

import com.sun.java.swing.plaf.windows.resources.windows;

public interface UserApi {
	void win(User use);

	void win(Admin use);

	void win(Boss use);

	void win(Service use);
}
