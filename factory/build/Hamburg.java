package build;

public class Hamburg implements Item {
	Packing pack;

	public Hamburg(Packing pack) {
		this.pack = pack;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Hamburg";
	}

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return pack;
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 10;
	}

}
