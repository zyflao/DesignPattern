package dao;

import api.Show;
import api.Wuqi;
import api.impl.KingShow;
import api.impl.OxeWuqi;
public class King extends Role {
	King(){
		  wuqi =new OxeWuqi();
		  show =new KingShow();
//		  wuqi.doThing();
//		  show.Say();
	}

	
}
