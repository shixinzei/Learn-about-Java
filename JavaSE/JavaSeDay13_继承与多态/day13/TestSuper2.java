package day13;

public class TestSuper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son();
		s.print();
		System.out.println();
		s.print("����");
		
	}

}

class Father{
	protected String info = "atguigu";
	
}

class Son extends Father{
//	private String info = "�й��";
	
	public void print() {
		System.out.println("����̳е�info = " + super.info);
		System.out.println("���������info = " + this.info);
		System.out.println("�ֲ�����info = " + info);
	}
	public void print(String info) {
		System.out.println("����̳е�info = " + super.info);
		System.out.println("���������info = " + this.info);
		System.out.println("�ֲ�����info = " + info);
	}
}