package behavior.Command.TV;

/**
 * 调用者Invoker:遥控器
 */
public class InvokerControler {

	/**
	 * 持有命令对象
	 */
	private ICommand iCommand;

	/**
	 * 设置调用者持有的命令对象
	 * 
	 * @param command
	 *            命令对象
	 */
	public void addCommand(ICommand iCommand) {
		this.iCommand = iCommand;
	}

	/**
	 * 示意方法，要求命令执行请求
	 */
	public void runCommand(ICommand iCommand) {
		// 调用命令对象的执行方法
		this.iCommand.execute();
	}
}