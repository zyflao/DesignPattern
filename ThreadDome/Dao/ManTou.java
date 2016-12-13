package Dao;

import sun.nio.cs.ext.TIS_620;
import Dao.impl.Food;

public class ManTou implements Food {
	public volatile int i = 0;

	synchronized void addFood() {
		this.i++;
		System.out.println("addFood" + i);
	}

	synchronized void subFood() {
		if (i > 0)

			this.i--;
		System.out.println("subFood one,have" + i);
	}
}
