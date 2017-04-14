package Bridge;

public class Circle implements Shape {
	private int x, y, radius;

	DrawAPI drawAPI;

	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.drawAPI = drawAPI;
	}

	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}
}