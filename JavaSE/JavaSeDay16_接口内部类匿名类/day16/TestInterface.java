package day16;

public class TestInterface {
	public static void main(String[] args) {
		MyInter.print();
		MyIml my = new MyIml();
		my.test();
		my.method();
		
	}
}

interface MyInter{
	String INFO = "";//ȫ�ֵľ�̬�ı���
	void test();//�����ĳ��󷽷�
	
	public static void print() {
		System.out.println("�ӿڵľ�̬����");
	}
	
	public default void method() {
		System.out.println("�ӿڵ�Ĭ�Ϸ���");
	}
}

class MyIml implements MyInter{

	@Override
	public void test() {
		System.out.println("ʵ�ֽӿڵĳ��󷽷�");
	}
	
}