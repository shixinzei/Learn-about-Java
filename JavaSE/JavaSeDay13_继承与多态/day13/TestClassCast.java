package day13;

public class TestClassCast {
	public static void main(String[] args) {
		Person1 p = new Man1(); // ��̬���� ����ת��
		Man1 m = new Man1(); // ��̬����

//		Man1 m2 = p;		
		Man1 m2 = (Man1)p; //����ת��
		
		Graphic g = new Circle2(2); // ��̬���� ����ת��
		Circle2 c = new Circle2(2); // ��̬����
		
		DoorMan d = new DoorMan();
		Chinese chinese = new Chinese();
		d.welcome(chinese); // 
		American amrican = new American();
		d.welcome(amrican);
			
	}
}

class DoorMan{
	public void welcome(Human h) {
		h.say();
		if(h instanceof Chinese) {
			Chinese c = (Chinese) h;
			c.eat();
		}else if(h instanceof American) {
			American a = (American) h;
			a.meet();
		}
		
	}
	
}

class Human{
	public void say() {
		System.out.println("�Ǻ�");
	}
}

class Chinese extends Human{
	public void say() {
		System.out.println("���");
	}
	public void eat() {
		System.out.println("�������");
	}
}

class American extends Human{
	public void say() {
		System.out.println("Hello");
	}
	public void meet() {
		// TODO Auto-generated method stub
		System.out.println("nice to meet you.");
	}
}

