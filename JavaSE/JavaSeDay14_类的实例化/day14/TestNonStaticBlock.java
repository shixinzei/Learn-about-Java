package day14;

public class TestNonStaticBlock {
	public static void main(String[] args) {
		Son s1 = new Son();	
//		Son s2 = new Son();	
//		Son s3 = new Son();	
		
		System.out.println(s1.getNum());
	}
}

class Father{
	Father(){
		System.out.println("������޲ι���");
	}
	{
		System.out.println("����ķǾ�̬�Ĵ����1");
	}
	private int i = getNumberI(); // ��ֵ
	{
		System.out.println("����ķǾ�̬�Ĵ����2");
	}
	public int getNumberI() {
		System.out.println("getNumberI()");
		return 1;
	}
	public int getI() {
		return i;
	}
}

class Son extends Father{
	
	Son(){
		System.out.println("�޲ι���");
		num = 3;
	}
	
	{
		System.out.println("�Ǿ�̬�Ĵ����1");
		num = 2;
	}
	private int num = getNumber(); // ��ֵ
	{
		System.out.println("�Ǿ�̬�Ĵ����2");
	}
	public int getNumber() {
		System.out.println("getNumber()");
		return 1;
	}
	public int getNum() {
		return num;
	}
	
}