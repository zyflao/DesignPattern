package StructureMode.proxy;

public class Proxy implements ProxyApi {

	Traget t;

	Proxy() {
		this.t = new Traget();
	}

	@Override
	public void before() {
		// TODO Auto-generated method stub
		System.out.println("before methods");
		this.t.dosomthing();
	}

	@Override
	public void after() {
		this.t.dosomthing();
		System.out.println("after methods");

	}

}
