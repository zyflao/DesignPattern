package StatePattern;

public class MyCandyMachine {
	public int candySum = 3;
	public int price = 25;
	public int hava_candy = 1;

	public boolean pullRocker = false;
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
				candySum--;
				return "eat candy :)";
			} else {

				return "stop_sall,return" + price;
			}
		}
		return "error";
	}

	public static void main(String[] args) {
		MyCandyMachine cMachine = new MyCandyMachine();
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
