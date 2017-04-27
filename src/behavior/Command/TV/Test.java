package behavior.Command.TV;

public class Test {

	public static void main(String[] args) {
		// 创建电视接收者
		Appliance app = new ReceiverTV();

		// 创建Invoker
		InvokerControler invokerControler = new InvokerControler();
		// 创建命令对象，设定它的接收者
		ConcreteCommandOpen commandOpen = new ConcreteCommandOpen(app);
		// 把命令对象设置进调用遥控器
		invokerControler.addCommand(commandOpen);

		// 执行打开命令
		invokerControler.runCommand(commandOpen);

	}
}
