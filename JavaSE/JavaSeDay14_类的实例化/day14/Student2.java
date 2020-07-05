package day14;

public class Student2 {
	private String name = "无名";
	private int age = 18;
	{
		System.out.println("非静态代码块1");
	}
	{
		System.out.println("非静态代码块2");
	}
	public Student2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student2() {
		super();
		System.out.println("无参构造");
	}
	
}
