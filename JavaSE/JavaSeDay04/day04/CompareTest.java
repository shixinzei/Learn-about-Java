package day04;

public class CompareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=20;
		System.out.println(num1==num2);
		System.out.println(num1=num2);
		
		boolean b1=false;
		if(b1==true) {
			System.out.println("结果为真");
		}else {
			System.out.println("结果为假");
		}
		
		boolean b2=false;
		if(b2=true) {
			System.out.println("结果为真");
		}else {
			System.out.println("结果为假");
		}
		
	}

}
