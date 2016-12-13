import sun.security.krb5.internal.Ticket;

public class RunnableDemo extends Thread {
	static int ticket = 100;

	RunnableDemo(String name) {
		super(name);
	}

	public void run() {
		while (ticket > 0) {

			System.out.println(ticket-- + "sales Ticket from "
					+ RunnableDemo.currentThread().getName());
		}
	}

	static void notSaleShareTicket() {
		RunnableDemo m1 = new RunnableDemo("Window 1");
		RunnableDemo m2 = new RunnableDemo("Window 2");
		RunnableDemo m3 = new RunnableDemo("Window 3");

		m1.start();

		m2.start();

		m3.start();

	}

	public static void main(String[] args) {
		notSaleShareTicket();
	}
}
