package day11;

public class Circle {
	private double radius;
	public void setRadius(double r) {
		radius=r;
	}
	public double getRadius() {
		return radius;
	}
	public double findArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	
}
