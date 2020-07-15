package day18;

public class TestTryCatchFinally {
	public static void main(String[] args) {
		try {
			int a = 1;
			int b = 0;
			int c = a/b;
			System.out.println("c = " + c);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("over");
		}
	}
}
