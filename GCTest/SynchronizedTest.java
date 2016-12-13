import java.util.ArrayList;

public class SynchronizedTest {

	public static void main(String[] args) {
		final InsertData insertData = new InsertData();

		new Thread() {
			public void run() {
				insertData.insert(Thread.currentThread());
			};
		}.start();

		new Thread() {
			public void run() {
				insertData.insert(Thread.currentThread());
			};
		}.start();
	}
}

class InsertData {
	private ArrayList<Integer> arrayList = new ArrayList<Integer>();

	public synchronized void insert(Thread thread) {
		for (int i = 0; i < 5; i++) {
			System.out.println(thread.getName() + "�ڲ�������" + i);
			arrayList.add(i);
		}
	}
}
