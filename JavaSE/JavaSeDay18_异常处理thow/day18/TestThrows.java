package day18;

public class TestThrows {
	public static void main(String[] args) {
		try {
			divide(3, 2);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
	
	public static int divide(int a, int b) throws ArithmeticException{
		return a/b;
	}
}
