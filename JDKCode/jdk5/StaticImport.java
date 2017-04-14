package jdk5;

public class StaticImport {
	public static void main(String[] args) {
		int x = 1;
		try {
			x++;
		} finally {
			System.out.println("template");
		}
		System.out.println(Math.random() * x);
	}
}
