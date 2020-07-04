package day13;

public class TestSuper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son();
		s.print();
		System.out.println();
		s.print("大硅谷");
		
	}

}

class Father{
	protected String info = "atguigu";
	
}

class Son extends Father{
//	private String info = "尚硅谷";
	
	public void print() {
		System.out.println("父类继承的info = " + super.info);
		System.out.println("子类的属性info = " + this.info);
		System.out.println("局部变量info = " + info);
	}
	public void print(String info) {
		System.out.println("父类继承的info = " + super.info);
		System.out.println("子类的属性info = " + this.info);
		System.out.println("局部变量info = " + info);
	}
}