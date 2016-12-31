package SingletonDao;

public class Emperpor {
	private final static Emperpor em = new Emperpor();

	private Emperpor() {

	}

	public void say() {
		System.out.println("yunfeng");
	}

	public static Emperpor getInstance() {
		return em;
	}
}

class SingletonTheard {
	private static SingletonTheard singleton = null;

	// 限制产生多个对象 c
	private SingletonTheard() {
	}

	// 通过该方法获得实例对象
	public static SingletonTheard getSingleton() {
		if (singleton == null) {
			singleton = new SingletonTheard();
		}
		return singleton;
	}
}