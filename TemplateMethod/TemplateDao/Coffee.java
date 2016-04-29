package TemplateDao;


public class Coffee extends YinLiao{
	@Override
	protected void doSomething() {
		System.out.println("打咖啡");
		
	}

	@Override
	protected void doAnything() {
		System.out.println("coffee可以喝了");
		
	}
	@Override
	protected void Sugar() {
		System.out.println("+糖");
		
		
	}
}
