package day14;

public class TestStaticExer1 {
	public static void main(String[] args) {
		Son1 s = new Son1();
		
		
	}
}

class Father1{
	static {
		System.out.println("(1)����ľ�̬�����");
	}
	{
		System.out.println("(2)����Ĺ�����");
	}
	Father1(){
		System.out.println("(3)������޲ι���");
	}
}

class Son1 extends Father1{
	static {
		System.out.println("(4)����ľ�̬�����");
	}
	{
		System.out.println("(5)����Ĺ�����");
	}
	Son1(){
		System.out.println("(6)������޲ι���");
	}
}
