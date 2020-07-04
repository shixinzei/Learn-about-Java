package day13_exer1;

public class Person {
	private String name;
	private int age;

	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getInfo() {
		return "ĞÕÃû£º"+name+",ÄêÁä£º"+age;
	}
}
