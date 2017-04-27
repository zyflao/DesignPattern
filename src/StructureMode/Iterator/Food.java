package StructureMode.Iterator;

public class Food {
	private String name;
	private double price;
	private String discription;
	private boolean havaFood;

	public Food(String name, double price, String discription, boolean havaFood) {
		this.name = name;
		this.price = price;
		this.discription = discription;
		this.havaFood = havaFood;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public boolean isHavaFood() {
		return havaFood;
	}

	public void setHavaFood(boolean havaFood) {
		this.havaFood = havaFood;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", discription="
				+ discription + ", havaFood=" + havaFood + "]";
	}

}
