package ProduceConsume;

import threadDao.ManTou;
import threadDao.impl.Food;

public class Produce {
	void creatFood(Food f, String s) {
		f.addFood(s);
	}

	public static void main(String[] args) {
		Food mTou = new ManTou(0);
		Produce p = new Produce();
		p.creatFood(mTou, "厨师");

		Consume consume = new Consume("顾客1");
		Consume consume1 = new Consume("顾客2");
		consume.setFood(mTou);
		consume1.setFood(mTou);

		consume.subFood(mTou, "顾客1");
		consume.start();
		consume1.start();

		// 厨师线程
		new Thread() {
			public void run() {
				int j = mTou.getFoodNum();
				System.out.println(j);
				while (true) {
					while (j < 10) {
						try {
							p.creatFood(mTou, "厨师1");

							// System.gc();
							sleep(1000 * 2);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						j = mTou.getFoodNum();

					}
				}
			};
		}.start();

		// 厨师2线程
		new Thread() {
			public void run() {
				int j = mTou.getFoodNum();
				System.out.println(j);
				while (true) {
					while (j < 10) {
						try {
							p.creatFood(mTou, "厨师2");
							// System.gc();
							sleep(1000 * 3);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						j = mTou.getFoodNum();

					}
				}
			};
		}.start();

	}
}