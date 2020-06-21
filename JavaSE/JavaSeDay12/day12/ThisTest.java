package day12;

public class ThisTest {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		p1.eat();
		
		
	}

}

class Person{
	String name;
	int age;
	
	public Person() {
		System.out.println("info");
	}
	
	public Person(String name) {
		this();
		this.name=name;
	}
	
	public Person(int age) {
		this("hehe");
		this.age=age;
	}
	
	public void eat() {
		System.out.println("³Ô·¹");
		this.study();
	}
	
	public void study() {
		System.out.println("Ñ§Ï°");
	}
	
	public void show() {
		System.out.println("name="+name+",age="+age);
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
}