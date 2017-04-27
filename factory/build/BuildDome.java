package build;

/**
 * @author yunfeng.zang
 * @createTime 2017年4月27日下午3:30:00 构建模式:构建多个（组成结构相同的）对象。让用户直接使用
 */
public class BuildDome {
	public Item Hamburg() {
		Wrapper wrapper = new Wrapper();
		Hamburg hamburg = new Hamburg(wrapper);
		return hamburg;
	}

	public Item Drink() {
		Bottle bottle = new Bottle();
		Drink drink = new Drink(bottle);
		return drink;
	}

	public static void main(String[] args) {
		BuildDome bDome = new BuildDome();
		bDome.Hamburg();
		System.out.println(bDome.Hamburg().name());
		System.out.println(bDome.Hamburg().price());
		System.out.println(bDome.Hamburg().packing().pack());
	}
}
