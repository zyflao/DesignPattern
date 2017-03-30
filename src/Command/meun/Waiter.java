package Command.meun;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
	/**
	 * 菜单
	 */
	private List<Food> foods = new ArrayList<Food>();
	private Cook cook = new ACoolie();

	/**
	 * 设置调用者持有的命令对象
	 * 
	 * @param command
	 *            命令对象
	 */
	public void reduceCommand(Food food) {
		System.out.println("顾客想删除" + food);
		for (Food iFood : foods) {
			if (iFood.equals(food)) {
				System.out.println("删除" + food);
				foods.remove(food);
			}
		}
		foods.add(food);
	}

	public void addCommand(Food food) {
		System.out.println("顾客想要" + food.intradus());
		foods.add(food);
	}

	public void recompile() {
		System.out.println("上菜");
	}

	/**
	 * 示意方法，要求命令执行请求
	 */
	public void runCommand() {
		// 调用命令对象的执行方法
		cook.execute(foods);

	}
}
