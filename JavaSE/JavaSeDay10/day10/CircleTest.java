package day10;

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double r=sc.nextDouble();
		Circle circle=new Circle();
		circle.r=r;
		circle.showPerimeter();
		circle.showArea();
		
	}

}

class Circle{
	double r;
	
	public void showPerimeter() {
		double perimeter=2*Math.PI*r;
		System.out.println("the perimeter="+perimeter);
	}
	
	public void showArea() {
		double area=Math.pow(r, 2)*Math.PI;
		System.out.println("the area="+area);
	}
	
}
