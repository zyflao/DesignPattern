package Bridge.myCase;

public class GodReBulid {

	private void buildMan(Soul soul, Body body) {
		body.show(soul);
	}

	public static void main(String[] args) {

		Soul soul = new Soul();
		Body body = new BodyPig();
		new GodReBulid().buildMan(soul, body);

	}
}
