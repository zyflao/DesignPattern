package dao;

import api.Show;
import api.Wuqi;
import api.impl.Dagger;
import api.impl.KingShow;
import api.impl.QueenShow;
/*
 * 策略模式是吧可变的功能放在抽象类 属性接口中，生产set方法，子类继承抽象方法，调用的接口实现不同，则调用方法表现不同。
 * 聚合，多用hava a，少用is a
 * 编程中写好不变的，把可变的 提炼。 
 */
public class Role {
	Wuqi wuqi;
	Show show;

	public void RoleSaySelf() { /*聚合 接口定义不同的实现 ,定义好的方法。实现由类自己决定*/
		show.Say();
	}

	void haveWuqi() {
		wuqi.doThing();
	}

	public void setWuqi(Wuqi w) {
		this.wuqi = w;
		System.out.println("武器更换！");
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public static void main(String[] args) {
		King king = new King();/* 国王有自己的show和武器。在自己的初始的时候定义*/
		// Queen queen = new Queen();
		king.RoleSaySelf(); /*介绍自己*/
		king.haveWuqi();    
		king.setWuqi(new Dagger());king.haveWuqi();
		king.setShow(new QueenShow());
		king.RoleSaySelf();
	}
}
