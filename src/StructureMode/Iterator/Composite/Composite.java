package StructureMode.Iterator.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite {

	public List<Student> list = new ArrayList<>();

	void add(String name, String number) {
		Student student = new Student();
		student.setName(name);
		student.setNumber(number);
		list.add(student);
	}

	@Override
	public String toString() {
		return "Composite [list=" + list + "]";
	}

	public static void main(String[] args) {
		Composite composite = new Composite();
		composite.add("name", "number");
		composite.add("name1", "number3");
		composite.add("name2", "number4");
		System.out.println(composite.toString());

	}
}
