package day18;

public class TestFinallyReturn {
	public static int getNum() {
		int i = 10;
		try {
			i = 20;
			System.out.println("try");
			return i;
		}catch(Exception e) {
			i = 30;
			System.out.println("catch");
			return i;
		}finally {
			i = 40;
			System.out.println("finally");
			return i;
		}
	}
	public static int getInt() {
		int i = 10;
		try {
			i = 20;
			System.out.println("try");
			return i;
		}catch(Exception e) {
			i = 30;
			System.out.println("catch");
			return i;
		}finally {
			i = 40;
			System.out.println("finally");
//			return i;
		}
	}
	public static void main(String[] args) {
		System.out.println(TestFinallyReturn.getNum());
		System.out.println(TestFinallyReturn.getInt());
	}
}
