package day14;

public class TestClinit1 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		
		
		
	}
}	

class A{
	private static int i = getInt();
	static {
		System.out.println("静态代码块");
	}
	private static int getInt() {
		System.out.println("A类的getInt()方法");
		return 1;
	}
}