package StructureMode.Iterator;

public class WesternFood {

	Food[] chineseList = new Food[3];
	static final int foodsize = 3;
	int initiationFoodSize = 0;

	public WesternFood() {
		addFood("意大利面", "面做的条形食物", 15., true);
		addFood("汉堡", "米和炒菜合成的食物", 30., true);
		addFood("薯条", "炒的食物", 20., true);
	}

	public void addFood(String name, String discription, Double price,
			boolean havaFood) {
		Food food = new Food(name, price, discription, havaFood);
		if (initiationFoodSize >= foodsize) {
			System.out.println("error ,foodsize is" + foodsize
					+ ",but initiationFoodSize" + initiationFoodSize);
		} else {
			chineseList[initiationFoodSize] = food;
			initiationFoodSize++;
		}
	}

	public Food[] getMuen() {
		return chineseList;

	}

	public Iterator createIterrator() {

		return new IteratorWesternFood(chineseList);

	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		new WesternFood().getMuen();
	}
}
