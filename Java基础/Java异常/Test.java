package “Ï≥£;

public class Test {
	public static void f()
	{
		int[] a=new int[10];
		a[10]=0;
		System.out.println("hello");
	}
	
	public static void g()
	{
		f();
	}
	
	public static void h()
	{
		int i=10;
		if(i<100) {
			g();
		}
	}
	
	public static void k()
	{
		try {
			h();
			System.out.println("in k()");
		}catch(NullPointerException e) {
			System.out.println("k()");
//			throw e;
		}finally {
			System.out.println("finally");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			k();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			// ∂—’ªµ˜”√πÏº£
			e.printStackTrace();
		}
		System.out.println("main");
	}

}
