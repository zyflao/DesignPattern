package StructureMode.wrapper;

public class Wrapper implements WrapperApi {

	@Override
	public void doWrapper(TragetApi ta) {
		// TODO Auto-generated method stub
		System.out.println("对a 进行装饰");
		ta.doSomthing();
	}

}
