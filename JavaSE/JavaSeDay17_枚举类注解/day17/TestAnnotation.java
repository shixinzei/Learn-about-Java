package day17;

public class TestAnnotation {
	public static void main(String[] args) {
		Father.method();
		
		
	}
}

class Father{
	public void println() {
		System.out.println("分类的打印方法");
	}
	
	public static void test() {
		System.out.println("分类的test");
	}
	
	@Deprecated
	public static void method() {
		System.out.println("xxxx");
	}
}

class Son extends Father{
	@Override
	public void println() {
		System.out.println("子类的打印方法");
	}
	
//	@Override
//	public static void test() {
//		System.out.println("分类的test");
//	}
	
}
