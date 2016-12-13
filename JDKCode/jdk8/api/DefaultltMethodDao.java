package jdk8.api;

public class DefaultltMethodDao implements InterfaceDefaultMethod {

	@Override
	public void oldApi(int i) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		InterfaceDefaultMethod defaultltMethodDao = new DefaultltMethodDao();

		int i = 1;
		System.out.println(defaultltMethodDao.newApi(i));
	}
}
