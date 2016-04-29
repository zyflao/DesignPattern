package factory.pizza;

public class ShiJind implements Pizza{

	public  ShiJind() {
	System.out.println("什锦dpizza");
		// TODO Auto-generated constructor stub
	}
	public void ag(){
		System.out.println("ag什锦d pizza");
		
	}
	public void Hi() {
		System.out.println("什锦d pizza+指定海鲜");
		
	}
	public void Shu() {
		System.out.println("什锦d pizza+指定蔬菜");
		
	}
	@Override
	public void size(String s ) {
		System.out.println(s);
		
	}
}
