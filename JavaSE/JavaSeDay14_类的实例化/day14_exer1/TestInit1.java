package day14_exer1;

public class TestInit1 {
	public static void main(String[] args) {
		A obj = new A(20);
	}
}
class A{
	private int a = getInt();
	
	{
		a++;
		System.out.println("(1)A�Ǿ�̬�����");
		System.out.println("(1)a = " + a);//2
	}
	
	A(int num){
		a = num;
		System.out.println("(2)A�вι���");
		System.out.println("(2)a = " + a);
	}
	
	private int getInt(){
		System.out.println("(3)A->getInt");
		System.out.println("(3)a = " + a);//1
		return 1;
	}
}