package day14_exer4;

public class TestInit4 {
	public static void main(String[] args) {
		A obj = new B(20);
	}
}
class A{
	private int a = getInt();
	
	{
		a++;
		System.out.println("(1)非静态代码块");
		System.out.println("(1)a = " + a);
	}
	
	A(int num){
		a = num;
		System.out.println("(2)A:有参构造");
		System.out.println("(2)a = " + a);
	}
	
	private int getInt(){
		System.out.println("(3)A->getInt");
		System.out.println("(3)a = " + a);
		return 1;
	}
}
class B extends A{
	private int b = getInt();
	
	{
		b++;
		System.out.println("(1)B:非静态代码块");
		System.out.println("(1)b = " + b);
	}
	
	B(int num){
		super(num);
		b = num;
		System.out.println("(2)B:有参构造");
		System.out.println("(2)b = " + b);
	}
	
	private int getInt(){
		System.out.println("(3)B->getInt");
		System.out.println("(3)b = " + b);
		return 1;
	}	
}