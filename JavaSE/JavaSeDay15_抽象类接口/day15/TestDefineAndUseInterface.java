package day15;

public class TestDefineAndUseInterface {
	public static void main(String[] args) {
		Flyable f = new Bird();
		f.fly();
//		f.jump();
		
		
	}
}

interface Flyable{
	int MAX_VALUE = 7900000;
	int MIN_VALUE = 0;
	void fly();
}

interface Jumpable{
	void jump();
}

class Animal{
	
}

class Bird extends Animal implements Flyable, Jumpable{
	
	
	@Override
	public void fly() {
		System.out.println("fly...");
	}

	@Override
	public void jump() {
		System.out.println("jump...");
	}
	
}

interface A{
	void a();
}

interface B{
	void b();
}

interface C extends A, B{
	void c();
}

class MySubClass implements C{

	@Override
	public void a() {
		
	}

	@Override
	public void c() {
	
	}

	@Override
	public void b() {
	}
	
}
