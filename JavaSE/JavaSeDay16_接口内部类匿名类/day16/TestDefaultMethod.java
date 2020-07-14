package day16;

public class TestDefaultMethod {
	public static void main(String[] args) {
		Person p = new Person();
		p.run();
		
		Sub s = new Sub();
		s.run();
	}
}

interface Runnable{
	public default void run() {
		System.out.println("Runnable��Ĭ�Ϸ���");
	}
	
}

interface Walkable{
	public default void run() {
		System.out.println("Walkable��Ĭ�Ϸ���");
	}
	
}

class Person implements Runnable, Walkable{

	@Override
	public void run() {
		
		Runnable.super.run();
	}
	
}

class Father{
	public void run() {
		System.out.println("Father���е�run()");
	}
}

class Sub extends Father implements Runnable{
	
}

class Daughter extends Father implements Runnable{
	public void run() {
		Runnable.super.run();
	}
}