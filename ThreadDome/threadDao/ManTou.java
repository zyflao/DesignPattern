package threadDao;

import threadDao.impl.Food;

public class ManTou implements Food {
	public volatile int i = 0;

	public ManTou(int i) {
		this.i = i;
	}

	public synchronized void addFood(String creater) {
		this.i++;
		System.out.println(creater + "addFood" + i);
	}

	public synchronized void subFood(String consume) {
		if (i > 0) {
			this.i--;
			System.out.println(consume + "subFood one,have" + i);
		}
	}

	@Override
	public synchronized int getFoodNum() {
		// TODO Auto-generated method stub
		return this.i;
	}
}
