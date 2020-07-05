package day14;

public class TestClinit2 {
	public static void main(String[] args) {
		SubB s1 = new SubB();
		SubB s2 = new SubB();
		
	}
}	

class B{
	private static int i = getInt();
	static {
		System.out.println("B类的静态代码块");
	}
	private static int getInt() {
		System.out.println("B类的getInt()方法");
		return 1;
	}
}

class SubB extends B{
	private static int j = getIntValue();
	static {
		System.out.println("Sub类的静态代码块");
	}
	private static int getIntValue() {
		System.out.println("SubB类的getIntValue()方法");
		return 1;
	}
}