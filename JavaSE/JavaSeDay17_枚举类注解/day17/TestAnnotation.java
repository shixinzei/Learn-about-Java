package day17;

public class TestAnnotation {
	public static void main(String[] args) {
		Father.method();
		
		
	}
}

class Father{
	public void println() {
		System.out.println("����Ĵ�ӡ����");
	}
	
	public static void test() {
		System.out.println("�����test");
	}
	
	@Deprecated
	public static void method() {
		System.out.println("xxxx");
	}
}

class Son extends Father{
	@Override
	public void println() {
		System.out.println("����Ĵ�ӡ����");
	}
	
//	@Override
//	public static void test() {
//		System.out.println("�����test");
//	}
	
}
