package day12;

public class Girl {
	private String name;
	private int age;

	public Girl(String name, int age) {
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
	public void marry(Boy boy) {
		System.out.println("marry this boy"+boy.getName());
		System.out.println("marry this gilr"+this.getName());
	}
	public int compare(Girl girl) {
//		return this.age>girl.age?1:(this.age==girl.age)?0:-1;
		return this.age-girl.age;
	}
	
}
