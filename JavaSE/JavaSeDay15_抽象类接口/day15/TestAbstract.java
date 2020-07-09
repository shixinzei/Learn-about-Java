package day15;

public class TestAbstract {
	public static void main(String[] args) {
//		Graphic g = new Graphic();
		Graphic g = new Circle(2);
		double area = g.getArea();
		System.out.println("�����" + area);
	}
}

abstract class Graphic{
	private String name;
	
	public abstract double getArea();
	public abstract double getPrimeter();
}

class Circle extends Graphic{
	private double radius;
	
	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

	@Override
	public double getPrimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}
	
}

//Ŀ�ģ������㴴�����Ķ������㴴������Ķ���
abstract class Person{
	//...
}

class Man extends Person{
	
}
