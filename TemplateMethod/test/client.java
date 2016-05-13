package test;

import TemplateDao.Coffee;
import TemplateDao.Tea;
import TemplateDao.YinLiao;

public class client {
	public static void main(String[] args) {
		YinLiao y = new Tea(true);
		Coffee c = new Coffee();
		c.setSugar(false);
		
		c.templateMethod();
		y.templateMethod();
	}
}
