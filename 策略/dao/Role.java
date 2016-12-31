package dao;

import api.Show;
import api.Wuqi;
import api.impl.Dagger;
import api.impl.KingShow;
import api.impl.QueenShow;

/*
 * ����ģʽ�ǰɿɱ�Ĺ��ܷ��ڳ����� ���Խӿ��У�����set����������̳г��󷽷������õĽӿ�ʵ�ֲ�ͬ������÷������ֲ�ͬ��
 * �ۺϣ�����hava a������is a
 * �����д�ò���ģ��ѿɱ�� ������ 
 */
public class Role {
	Wuqi wuqi;
	Show show;

	public void RoleSaySelf() { /* �ۺ� �ӿڶ��岻ͬ��ʵ�� ,����õķ�����ʵ�������Լ����� */
		show.Say();
	}

	void haveWuqi() {
		wuqi.doThing();
	}

	public void setWuqi(Wuqi w) {
		this.wuqi = w;
		System.out.println("change equit");
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public static void main(String[] args) {
		King king = new King();
		king.RoleSaySelf();
		king.haveWuqi();

		king.setWuqi(new Dagger());
		king.haveWuqi();
		king.setShow(new QueenShow());
		king.RoleSaySelf();
	}
}
