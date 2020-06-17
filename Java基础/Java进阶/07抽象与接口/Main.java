package 抽象与接口;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Fraction a= new Fraction(in.nextInt(),in.nextInt());
		Fraction b= new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.print();
		b.print();
		in.close();
	}
}

class Fraction
{
	int a;
	int b;
	
	Fraction(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void print()
	{
		System.out.println("a="+this.a+",b="+this.b);
	}
	
	Fraction plus(Fraction fra)
	{
		this.a+=fra.a;
		this.b+=fra.b;
		return this;
	}
}