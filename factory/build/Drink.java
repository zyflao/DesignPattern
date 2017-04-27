package build;

public class Drink implements Item {
	Packing pack;

	public Drink(Packing pack) {
		this.pack = pack;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Drink";
	}

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return this.pack;
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 10;
	}

}
