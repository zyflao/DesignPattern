package ProduceConsume;

import threadDao.impl.Food;

public class Consume extends Thread {
	Food food;

	public void setFood(Food food) {
		this.food = food;
	}

	Consume(String name) {
		super(name);
	}

	public void subFood(Food f, String consume) {
		f.subFood(consume);
	}

	public void run() {
		synchronized (this) {
			try {
				while (true) {
					int j = food.getFoodNum();
					while (j == 0) {
						System.out.println(Consume.currentThread().getName()
								+ "没有吃的了");
						wait(1000);
						j = food.getFoodNum();
					}
					while (j > 0) {
						subFood(food, Consume.currentThread().getName());
						// System.gc();
						sleep(1000);
						this.notify();
						j = food.getFoodNum();
					}

				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
