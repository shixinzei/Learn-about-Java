package day13;

public class TestOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}

}

class Circle{
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
	
	public double getArea() {
		return Math.PI*radius*radius; 
	}
}

class Cylider extends Circle{
	private double height;

	public Cylider(double height) {
		super();
		this.height = height;
	}

	public Cylider() {
		super();
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return Math.PI*getRadius()*getRadius()*2+2*Math.PI*getHeight()*getRadius();
	}
}
 
