package day04;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 结构一：
		int hb=120;
		if(hb<60||hb>100) {
			System.out.println("abnormal");
		}
		System.out.println("finish");
		
		// 结构二：
		int age=20;
		if(age>18) {
			System.out.println("big");
		}else {
			System.out.println("small");
		}
		
		// 结构三：
		if(age<0||age>130) {
			System.out.println("error");
		}else if(age<12) {
			System.out.println("young");
		}else {
			System.out.println("big");
		}
		
	}

}
