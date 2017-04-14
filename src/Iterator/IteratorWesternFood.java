package Iterator;

import java.util.ArrayList;

public class IteratorWesternFood implements Iterator {
	Food[] items;
	int position = 0;

	public IteratorWesternFood(ArrayList<Food> chineseList) {
		this.items = items;
	}

	public IteratorWesternFood(Food[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNest() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		Food f = items[position];
		position = position + 1;
		return f;
	}

}
