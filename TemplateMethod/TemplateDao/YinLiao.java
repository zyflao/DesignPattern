package TemplateDao;

public abstract class YinLiao {
	protected abstract void doSomething();

	protected abstract void doAnything();

	protected abstract void Sugar();

	public void templateMethod() {

		this.doSomething();
		// 钩子，修改子类影响父类的方法。模板方法模式
		if (isSugar()) {
			this.Sugar();
		}

		this.doAnything();
	}

	public boolean isSugar() {
		return true;
	}

}
