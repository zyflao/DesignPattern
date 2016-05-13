package TemplateDao;


public class Coffee extends YinLiao{
	private static boolean Sugarflag; 
	
	public static void setSugar(boolean c) {
		Sugarflag = c;
	}
	public  boolean isSugar() {
		return this.Sugarflag;
	}
	@Override
	protected void doSomething() {
		System.out.println("打咖啡");
		
	}

	@Override
	protected void doAnything() {
		System.out.println("coffee可以喝了");
		
	}
	@Override
	public void Sugar() {
		System.out.println("+糖");
	}
	
}
