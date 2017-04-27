package StructureMode.adapter;

/**
 * 适配器火鸟转成鸭子
 * 
 * @author yunfeng.zang
 * @createTime 2017年3月30日下午9:42:35
 * 
 */
public class Adepter implements Duck {
	Turkey turkey;

	public Adepter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		turkey.fly();
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		this.turkey.gobble();
	}

}
