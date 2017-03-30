package Command.meun;

public class Chaofan implements Food {

	@Override
	public String intradus() {
		String clazz = Thread.currentThread().getStackTrace()[1].getClassName();
		return clazz;

	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getStackTrace()[1]
				.getClassName());
	}
}
