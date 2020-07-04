package day13;

public class Person {
	private String name;
	private int age;
	//无参构造
	public Person() {
		super();
		System.out.println("父类的无参构造");
	}
	public Person(String name, int age) {
//		super();
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
		return "姓名："+name+"，年龄："+age;
	}
}
