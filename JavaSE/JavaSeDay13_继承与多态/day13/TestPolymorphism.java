package day13;

public class TestPolymorphism {
	public static void main(String[] args) {
		Person1 p = new Person1(); // ��̬����
		p.walk();
		Person1 p2 = new Man1(); // ��̬����
		p2.walk();
	}
}

class Person1{
	public void walk() {
		System.out.println("��·");
	}
	public void smoke() {
		System.out.println();
	}
}

class Man1 extends Person1{
	public void walk() {
		System.out.println("��ҡ��ڵ���·");
	}
	public void smoke() {
		System.out.println("����");
	}
}

class Woman1 extends Person1{
	public void walk() {
		System.out.println("��ȶ��˵���·");
	}
}