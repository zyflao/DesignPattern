package dao;

import api.impl.QueenShow;
import api.impl.Sword;
import api.impl.OxeWuqi;

public class Queen extends Role {
	Queen() {
		wuqi = new Sword();
		show = new QueenShow();
		/*
		 * wuqi.doThing(); show.Say();
		 */
	}
}
