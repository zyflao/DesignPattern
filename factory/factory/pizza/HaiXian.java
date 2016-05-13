package factory.pizza;

public abstract class  HaiXian implements Pizza{
	
	public HaiXian() {
	System.out.println("海鲜pizza");
	}
	public void Hi() {
		System.out.println("海鲜pizza+指定海鲜");
		
	}
	public void Shu() {
		System.out.println("海鲜pizza+指定蔬菜");
		
	}
	@Override
	public void ag() {
		// TODO Auto-generated method stub
		
	}

}
