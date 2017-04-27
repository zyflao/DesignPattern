package behavior.Command.meun;

public class Test {

	public static void main(String[] args) {

		Food food = new Chaofan();

		Waiter waiter = new Waiter();

		waiter.addCommand(food);

		waiter.runCommand();
	}
}
