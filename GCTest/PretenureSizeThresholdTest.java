import sun.misc.GC;

/**
 * PretenureSizeThreshold vm pram : -verbose:gc -Xms20M -Xmx20M -Xmn10M
 * -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728
 * Xmx maxJVM Momery Xms init JVM Momery
 * -XX:SurvivorRatio=4设置年轻代中Eden区与Survivor区的大小比值。
 * 设置为4，则两个Survivor区与一个Eden区的比值为2:4，一个Survivor区占整个年轻代的1/6
 * -XX:MaxPermSize=16m:设置持久代大小为16m。
 * -XX:MaxTenuringThreshold=0：设置垃圾最大年龄。如果设置为0的话，则年轻代对象不经过Survivor区，直接进入年老代。
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