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

/**
 * volatile 多线程同步 synchronized 保证多线程下加锁
 */
class SingletonTheard {
	private volatile static SingletonTheard singleton = null;

	// 限制产生多个对象 c
	private SingletonTheard() {
	}

	// 通过该方法获得实例对象
	public static SingletonTheard getSingleton() {
		if (singleton == null) {
			synchronized (SingletonTheard.class) {
				if (singleton == null) {
					singleton = new SingletonTheard();
				}
			}
		}
		return singleton;
	}
}