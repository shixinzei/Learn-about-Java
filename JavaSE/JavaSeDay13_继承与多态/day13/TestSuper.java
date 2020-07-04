package day13;

public class TestSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal("3");
		Dog d = new Dog("4","哈巴狗");
		
		a.setAge("5");
		System.out.println(a.getAge());
		
		d.setAge("6");
		System.out.println(d.getAge());
		System.out.println(d.getInfo());
		
		System.out.println();
		
		Cuboid c = new Cuboid(2, 4, 1);
		System.out.println(c.getInfo());
		
	
	}

}

class Animal{
	private String age;

	public Animal(String age) {
		super();
		this.age = age;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}

class Dog extends Animal{
	private String type;

	public Dog(String age, String type) {
		super(age);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getInfo() {
		return "年龄："+getAge()+"，种类:"+type;
	}
	
}

class Rectangle{
	private double length;
	private double width;
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public Rectangle() {
		super();
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public String getInfo() {
		return "长：" + length + "，宽：" + width;
	}
	
}

class Cuboid extends Rectangle{
	private double height;

	public Cuboid(double length, double width, double height) {
		super(length, width);
		this.height = height;
	}

	public Cuboid(double length, double width) {
		super(length, width);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public String getInfo() {
		return super.getInfo() + "，高：" + height;
	}
}