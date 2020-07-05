package day14;

public class TestClinit3 {
	public static void main(String[] args) {
		D.test();
		D.test();
		
	}
}	

class D{
	static {
		System.out.println("(1)¾²Ì¬´úÂë¿é");
	}
	public static void test() {
		System.out.println("(2)¾²Ì¬·½·¨");
	}
}