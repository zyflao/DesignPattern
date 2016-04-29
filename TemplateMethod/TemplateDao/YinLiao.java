package TemplateDao;


public abstract class YinLiao {
	protected abstract void doSomething();
	protected abstract void doAnything();
	protected abstract void Sugar();
	
	public void templateMethod(){
		
		this.doSomething();
		if(this.isSugar()){
			this.Sugar();
		}
		
		this.doAnything();
	}
	private boolean isSugar() {
		return true;
	}
	
}
