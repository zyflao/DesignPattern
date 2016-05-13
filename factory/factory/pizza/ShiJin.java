package factory.pizza;

public class ShiJin implements Pizza{

	public  ShiJin() {
	System.out.println("什锦pizza");
		// TODO Auto-generated constructor stub
	}
	public void ag(){
		System.out.println("ag什锦pizza");
		
	}
	public void Hi() {
		System.out.println("什锦pizza+指定海鲜");
		
	}
	public void Shu() {
		System.out.println("什锦pizza+指定蔬菜");
		
	}

	@Override
	public void size(String s) {
		System.out.println(s);
		
	}
}
