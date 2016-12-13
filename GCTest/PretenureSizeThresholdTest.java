import sun.misc.GC;

/**
 * PretenureSizeThreshold vm pram : -verbose:gc -Xms20M -Xmx20M -Xmn10M
 * -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728
 * Xmx maxJVM Momery Xms init JVM Momery
 * -XX:SurvivorRatio=4�����������Eden����Survivor���Ĵ�С��ֵ��
 * ����Ϊ4��������Survivor����һ��Eden���ı�ֵΪ2:4��һ��Survivor��ռ�����������1/6
 * -XX:MaxPermSize=16m:���ó־ô���СΪ16m��
 * -XX:MaxTenuringThreshold=0����������������䡣�������Ϊ0�Ļ�������������󲻾���Survivor����ֱ�ӽ������ϴ���
 * -Dfile.encoding=utf8
 */

public class PretenureSizeThresholdTest {

	private static final int _1MB = 1024 * 1024;
	private static int i = 1;

	static void savePreOldGen() {
		byte[] allocation;
		allocation = new byte[9 * _1MB];
	}

	static void roundPrintsystem() {
		System.out.println("this is " + i++);
	}

	public static void main(String[] args) {
		// PretenureSizeThresholdTest.savePreOldGen();

		new Thread() {
			public void run() {

				int j = 0;
				while (j < 10) {
					try {
						PretenureSizeThresholdTest.roundPrintsystem();
						// System.gc();
						sleep(1000 * 60 * 10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					j++;
				}

			};
		}.start();

	}
}