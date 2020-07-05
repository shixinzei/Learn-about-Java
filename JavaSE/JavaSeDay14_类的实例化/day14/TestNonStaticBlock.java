package day14;

public class TestNonStaticBlock {
	public static void main(String[] args) {
		Son s1 = new Son();	
//		Son s2 = new Son();	
//		Son s3 = new Son();	
		
		System.out.println(s1.getNum());
	}
}

class Father{
	Father(){
		System.out.println("父类的无参构造");
	}
	{
		System.out.println("父类的非静态的代码块1");
	}
	private int i = getNumberI(); // 赋值
	{
		System.out.println("父类的非静态的代码块2");
	}
	public int getNumberI() {
		System.out.println("getNumberI()");
		return 1;
	}
	public int getI() {
		return i;
	}
}

class Son extends Father{
	
	Son(){
		System.out.println("无参构造");
		num = 3;
	}
	
	{
		System.out.println("非静态的代码块1");
		num = 2;
	}
	private int num = getNumber(); // 赋值
	{
		System.out.println("非静态的代码块2");
	}
	public int getNumber() {
		System.out.println("getNumber()");
		return 1;
	}
	public int getNum() {
		return num;
	}
	
}