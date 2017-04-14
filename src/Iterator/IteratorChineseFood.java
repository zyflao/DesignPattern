package Iterator;

import java.util.ArrayList;

public class IteratorChineseFood implements Iterator {
	ArrayList<Food> chineseList;
	int position = 0;

	public IteratorChineseFood(ArrayList<Food> chineseList) {
		this.chineseList = chineseList;
	}

	@Override
	public boolean hasNest() {
		if (position >= chineseList.size() || chineseList.get(position) == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		Food f = chineseList.get(position);
		position = position + 1;
		return f;
	}

}
