package day16;

public class TestInterface {
	public static void main(String[] args) {
		MyInter.print();
		MyIml my = new MyIml();
		my.test();
		my.method();
		
	}
}

interface MyInter{
	String INFO = "";//全局的静态的变量
	void test();//公共的抽象方法
	
	public static void print() {
		System.out.println("接口的静态方法");
	}
	
	public default void method() {
		System.out.println("接口的默认方法");
	}
}

class MyIml implements MyInter{

	@Override
	public void test() {
		System.out.println("实现接口的抽象方法");
	}
	
}