package day13;

class Rectangle2 extends Graphic{
	private double length;
	private double width;
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
	public Rectangle2(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public Rectangle2() {
		super();
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length * width;
	}
	
}