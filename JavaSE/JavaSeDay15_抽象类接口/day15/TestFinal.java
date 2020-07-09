package day15;

public class TestFinal {
	public static void main(String[] args) {
		final int NUM = 10;
		final MyClass my = new MyClass();
		my.i = 20;
		
		
	}
}

class MyClass{
	int i;
}