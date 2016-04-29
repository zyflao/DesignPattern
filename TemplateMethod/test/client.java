package test;

import TemplateDao.Tea;
import TemplateDao.YinLiao;

public class client {
	public static void main(String[] args) {
		YinLiao y = new Tea(false);
		//YinLiao y = new Coffee();
		y.templateMethod();
	}
}
