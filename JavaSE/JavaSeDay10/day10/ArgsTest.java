package day10;

public class ArgsTest {
	public void method(int i) {
		System.out.println("int");
	}
	
	public void method(String s) {
		System.out.println("String");
	}
	
	public void method(String ...strs) {
		System.out.println("String型可变参数");
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
	}

	public void method(int n,String ...strs) {
		System.out.println("String型可变参数");
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
	}
	
//	public void method(String[] args) {
//		System.out.println("String型可变参数");
//		for(int i=0;i<args.length;i++) {
//			System.out.println(args[i]);
//		}
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsTest test=new ArgsTest();
		test.method(3);
		test.method("AA","BB");
		test.method(new String[] {"AA","BB"});
		
	}

}
