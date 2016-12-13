package jdk8.api;

interface InterfaceDefaultMethod {
	public void oldApi(int i);

	default int newApi(int i) {
		return i;
	}
}
