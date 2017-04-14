package Iterator;

import java.util.ArrayList;
import java.util.List;

public class ChineseFood {
	ArrayList<Food> chineseList = new ArrayList<>();

	public ChineseFood() {
		addFood("面条", "面做的条形食物", 15., true);
		addFood("盖饭", "米和炒菜合成的食物", 30., true);
		addFood("炒菜", "炒的食物", 20., true);
	}

	public void addFood(String name, String discription, Double price,
			boolean havaFood) {
		Food food = new Food(name, price, discription, havaFood);
		chineseList.add(food);
	}

	// arg[] charge in Iterator
	public Iterator createIterrator() {

		return new IteratorChineseFood(chineseList);

	}

	List<Food> getMuen() {
		return chineseList;

	}
}
