package behavior.StatePattern;

import java.util.Random;

public class MyNewCandyMachine {
	public int candySum = 3;
	public int price = 25;
	public int hava_candy = 1;
	public boolean pullRocker = false;
	public int rale = 10;
	public int rewardCandy = 1;

	public static String stop_sall = "stop_sall";

	public String candy(int price) {

		if (price == this.price) {
			this.pullRocker = true;
			return "pull rocker";
		} else {
			return "renturn " + price + "plasses put " + this.price;
		}
	}

	public String pullRocker(boolean pullRocker) {
		if (this.pullRocker != true) {
			return "coin";
		}
		if (pullRocker) {
			if (candySum > 0) {
				Random ran = new Random();
				int i = ran.nextInt(rale) + 1;
				if (i == rale) {
					System.out.println(i);
					candySum = candySum - rewardCandy;
					System.out.println("中奖了");
					candySum--;
					return "eat candy :)" + "中奖了";
				}
				candySum--;
				return "eat candy :)";
			} else {

				return "stop_sall,return" + price;
			}
		}
		return "error";
	}

	public static void main(String[] args) {
		MyNewCandyMachine cMachine = new MyNewCandyMachine();
		System.out.println(cMachine.candy(15));
		System.out.println(cMachine.pullRocker(true));
		System.out.println(cMachine.candy(25));
		System.out.println(cMachine.pullRocker(true));
		System.out.println(cMachine.candy(25));
		System.out.println(cMachine.pullRocker(true));
		System.out.println(cMachine.candy(25));
		System.out.println(cMachine.pullRocker(true));

	}
}
