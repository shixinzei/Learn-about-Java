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
		System.out.println("��̬�����");
	}
	private static int getInt() {
		System.out.println("A���getInt()����");
		return 1;
	}
}