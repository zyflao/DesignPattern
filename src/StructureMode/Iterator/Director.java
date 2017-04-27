package StructureMode.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Director {

	List<Food> menuList = new ArrayList<Food>();

	List<Food> chineseFoodList;
	Food[] westernFoodList;

	ChineseFood chineseFood;
	WesternFood westernFood;

	public Director(ChineseFood cFood, WesternFood wFood) {
		this.chineseFood = cFood;
		this.westernFood = wFood;
		this.chineseFoodList = cFood.getMuen();
		this.westernFoodList = wFood.getMuen();
	};

	List<Food> getMuen() {
		for (int i = 0; i < chineseFoodList.size(); i++) {
			menuList.add(chineseFoodList.get(i));
		}
		for (int i = 0; i < westernFoodList.length; i++) {
			menuList.add(westernFoodList[i]);
		}
		return menuList;
	}

	// Iterator 模式
	public void printMenu() {
		Iterator iteratorChinese = chineseFood.createIterrator();
		Iterator IteratorWesternFood = westernFood.createIterrator();
		printMenu(iteratorChinese);
		printMenu(IteratorWesternFood);
	}

	public void printMenu(Iterator iterator) {
		while (iterator.hasNest()) {
			Food food = (Food) iterator.next();
			System.out.println(food.toString());
		}
	}

	public static void main(String[] args) {
		ChineseFood cFood = new ChineseFood();
		WesternFood wFood = new WesternFood();
		Director director = new Director(cFood, wFood);

		// 不使用Iterator模式
		/*
		 * List<Food> l = director.getMuen(); for (Food food : l) {
		 * System.out.println(food.toString()); }
		 */
		// 使用Iterator模式
		director.printMenu();
	}
}
