public class ThreadDemo extends Thread {

	private int ticket = 5;// 每个线程都拥有100张票

	ThreadDemo(String name) {
		super(name);
	}

	ThreadDemo() {
		super();
	}

	public void run() {
		// synchronized (this) {
		while (ticket > 0) {
			System.out.println(ticket-- + " is saled by "
					+ Thread.currentThread().getName());
			// }
		}
	}

	static void saleShareTicket() {
		ThreadDemo ThreadDemo = new ThreadDemo();
		Thread m2 = new Thread(ThreadDemo, "Window 2");
		Thread m3 = new Thread(ThreadDemo, "Window 3");
		m2.start();
		m3.start();
		// m3.start();
	}

	static void notSaleShareTicket() {
		ThreadDemo m1 = new ThreadDemo("Window one");
		ThreadDemo m2 = new ThreadDemo("Window 2");
		ThreadDemo m3 = new ThreadDemo("Window 3");
		m1.start();
		m2.start();
		// m3.start();
	}

	public synchronized void insert(Thread thread) {
		for (int i = 0; i < 5; i++) {
			System.out.println(thread.getName() + "在插入数据" + i);
		}
	}

	public static void main(String[] args) {
		saleShareTicket();
		// notSaleShareTicket();
	}
}
