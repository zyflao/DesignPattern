package adapter;

public class Test {

	public static void main(String[] args) {
		WildTurkey wildTurkey = new WildTurkey();

		Duck duck = new Adepter(wildTurkey);
		// 适配后,野鸡适配成了鸭子
		duck.fly();
		duck.quack();
	}
}
