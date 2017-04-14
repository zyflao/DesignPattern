package jdk8.dao;

import java.util.stream.IntStream;

public class StreamTest {
	public void foreachOld(int j) {
		for (int i = 0; i <= j; i++) {
			System.out.println(i);
		}
	}

	public void foreachTest(int i) {
		IntStream.range(1, i + 1).forEach(value -> System.out.print(value));

	}

	public static void main(String[] args) {
		StreamTest streamTest = new StreamTest();
		streamTest.foreachTest(10);
	}
}
