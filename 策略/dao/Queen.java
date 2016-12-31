package dao;

import api.Show;
import api.Wuqi;
import api.impl.QueenShow;
import api.impl.Sword;

public class Queen extends Role {
	Queen() {
		wuqi = new Sword();
		show = new QueenShow();
		/*
		 * wuqi.doThing(); show.Say();
		 */
	}

	Wuqi wuqi;
	Show show;

	Queen(Wuqi wuqi, Show show) {
		this.wuqi = wuqi;
		this.show = show;
	}

	void roleSaySelf() {
		this.show.Say();
	}

	void haveWuqi() {
		this.wuqi.doThing();
	}
}
