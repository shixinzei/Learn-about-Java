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
		System.out.println("B��ľ�̬�����");
	}
	private static int getInt() {
		System.out.println("B���getInt()����");
		return 1;
	}
}

class SubB extends B{
	private static int j = getIntValue();
	static {
		System.out.println("Sub��ľ�̬�����");
	}
	private static int getIntValue() {
		System.out.println("SubB���getIntValue()����");
		return 1;
	}
}