package day16;

public class TestStaticInner {
	public static void main(String[] args) {
		Outer.print();
		
		Outer.Inner in = new Outer.Inner();
		in.test();
		
		Outer.Inner.method();
		
		
		
	}
}

class Outer{
	private static int i;
	private int j;
	static class Inner{
		public void test() {
			System.out.println(i);
//			System.out.println(j);
			
		}
		public static void method() {
			System.out.println("内部类的静态方法");
		}
	}
	
	abstract static class In{
		
	}
	
	public Inner getInner() {
		Inner in = new Inner();
		return in;
	}
	
	
	public static void print() {
		System.out.println("外部类的静态方法");
	}
	
}