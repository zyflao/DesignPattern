package jdk5;

public enum Human {
	MALE("nan", "1"), FEMALE("nv", "0");
	private final String key;
	private final String value;

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	Human(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public static void main(String[] args) {
		System.out.println(Human.MALE.getKey());
	}
}
