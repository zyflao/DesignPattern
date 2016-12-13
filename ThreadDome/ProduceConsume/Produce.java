package ProduceConsume;

import Dao.ManTou;
import Dao.impl.Food;

public class Produce {
	void creatFood(Food f) {
		f.addFood();
	}

	public static void main(String[] args) {
		ManTou mTou = new ManTou();
		mTou.i = 1;
		Produce p = new Produce();
		p.creatFood(mTou);

	}
}

class Consume {
	void creatFood(Food f) {
		f.subFood();
	}
}