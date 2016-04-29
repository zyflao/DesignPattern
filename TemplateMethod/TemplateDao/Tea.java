package TemplateDao;


public class Tea extends YinLiao{
	private static boolean Sugar; 

	 public Tea(boolean T){
		this.Sugar = T;
	}
	@Override
	protected void doSomething() {
		System.out.println("do沏茶");
		
	}

	@Override
	protected void doAnything() {
		System.out.println("可以了能喝");
		
	}

	@Override
	protected void Sugar() {
		System.out.println("+热水");
	}
	
	protected  boolean isSugar() {
		return this.Sugar;
	}
	
}
