package factory.pizza;

public class HaiXianl  implements Pizza{
	private String size="小的";
	public HaiXianl(){
		System.out.println(size+"HaiXian");
		
	}

	@Override
	public void size(String s) {
		System.out.println(s);
		
	}
	@Override
	public void Hi() {
		System.out.println(size+"+海鲜");
		
	}
	@Override
	public void Shu() {
		System.out.println(size+"+蔬菜");
		
	}
	@Override
	public void ag() {
		System.out.println(size+"+再来一份");
		
	}
}
