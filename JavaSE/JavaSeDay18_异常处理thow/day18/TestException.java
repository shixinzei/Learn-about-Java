package day18;

public class TestException {
	public static void main(String[] args) {
//		System.out.println(a);
		System.out.println(getSum(1,2));
	
		System.out.println(getDivide(2, 1));
		System.out.println(getDivide(9, 2));
		System.out.println(getDivide(9, 0));
	}
	 
	public static int getSum(int a,int b) {
		return a*b;
	}
	
	public static int getDivide(int a,int b) {
		int shang = 0;
		try {
			shang = a/b;
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("º∆À„ÕÍ±œ");
		return shang;
	}
}
