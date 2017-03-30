package adapter;

/**
 * @author yunfeng.zang
 * 
 * @createTime 2017年3月30日下午9:36:52
 * 
 * @instructions 野鸭
 */
public class MallardDuck implements Duck {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Quack");
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("I'm flying");
	}

}
