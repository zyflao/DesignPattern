package behavior.Command.meun;

import java.util.List;

public class ACoolie implements Cook {

	@Override
	public void execute(List<Food> foods) {
		for (Food food : foods) {
			System.out.println("制作:" + food.intradus());
		}
		System.out.println("上菜");
	}

}
