package Command.TV;

public class ReceiverTV implements Appliance {

	/**
	 * 真正执行命令相应的打开操作
	 */
	public void actionOpen() {
		System.out.println("actionOpen");
	}

	/**
	 * 真正执行命令相应的关闭操作
	 */
	public void actionClose() {
		System.out.println("actionCl    ose");
	}

	/**
	 * 真正执行命令相应的换频道操作
	 */
	public void actionChange() {
		System.out.println("换台");
	}
}