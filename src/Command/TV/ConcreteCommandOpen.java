package Command.TV;

/**
 * ConcreteCommand具体的命令实现对象:打开命令
 */
public class ConcreteCommandOpen implements ICommand {
	/**
	 * 持有相应的接收者对象
	 */
	private Appliance app = null;
	/**
	 * 示意，命令对象可以有自己的状态
	 */
	private String $_state;

	/**
	 * 构造方法，传入相应的接收者对象
	 * 
	 * @param receiver
	 *            相应的接收者对象
	 */
	public ConcreteCommandOpen(Appliance app) {
		this.app = app;
	}

	public void execute() {
		// 通常会转调接收者对象的相应方法，让接收者来真正执行功能
		this.app.actionOpen();
	}
}

/**
 * ConcreteCommand具体的命令实现对象：关闭
 */
class ConcreteCommandClose implements ICommand {
	/**
	 * 持有相应的接收者对象
	 */
	private Appliance app = null;
	/**
	 * 示意，命令对象可以有自己的状态
	 */
	private String $_state;

	/**
	 * 构造方法，传入相应的接收者对象
	 * 
	 * @param receiver
	 *            相应的接收者对象
	 */
	public ConcreteCommandClose(Appliance app) {
		this.app = app;
	}

	public void execute() {
		// 通常会转调接收者对象的相应方法，让接收者来真正执行功能
		this.app.actionClose();
	}
}

/**
 * ConcreteCommand具体的命令实现对象：换频道
 */
class ConcreteCommandChange implements ICommand {
	/**
	 * 持有相应的接收者对象
	 */
	private Appliance app = null;
	/**
	 * 示意，命令对象可以有自己的状态
	 */
	private String $_state;

	/**
	 * 构造方法，传入相应的接收者对象
	 * 
	 * @param receiver
	 *            相应的接收者对象
	 */
	public ConcreteCommandChange(Appliance app) {
		this.app = app;
	}

	public void execute() {
		// 通常会转调接收者对象的相应方法，让接收者来真正执行功能
		this.app.actionChange();
	}

}
