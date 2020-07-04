package day13;

public class TestPolymorphism {
	public static void main(String[] args) {
		Person1 p = new Person1(); // 本态引用
		p.walk();
		Person1 p2 = new Man1(); // 多态引用
		p2.walk();
	}
}

class Person1{
	public void walk() {
		System.out.println("走路");
	}
	public void smoke() {
		System.out.println();
	}
}

class Man1 extends Person1{
	public void walk() {
		System.out.println("大摇大摆的走路");
	}
	public void smoke() {
		System.out.println("吸烟");
	}
}

class Woman1 extends Person1{
	public void walk() {
		System.out.println("婀娜多姿的走路");
	}
}