package day04;

public class LogicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1=true;
		boolean b2=false;
		
		System.out.println("b1 & b2 : "+(b1&b2));
		System.out.println("b1 && b2 : "+(b1&&b2));
		System.out.println("b1 | b2 : "+(b1|b2));
		System.out.println("b1 || b2 : "+(b1||b2));
		System.out.println("!b1 : "+(!b1));
		System.out.println("b1 ^ b2 : "+(b1^b2));
		
		// 区分&与&&
		boolean a1=true;
		int num1=10;
		if(a1&(num1++>0)) {
			System.out.println("aaaa");
		}else {
			System.out.println("bbbb");
		}
		System.out.println("num1="+num1);
		
		boolean a2=true;
		int num2=10;
		if(a2&&(num2++>0)) {
			System.out.println("aaaa");
		}else {
			System.out.println("bbbb");
		}
		System.out.println("num2="+num2);
		
		boolean a3=false;
		int num3=10;
		if(a3&(num1++>0)) {
			System.out.println("aaaa");
		}else {
			System.out.println("bbbb");
		}
		System.out.println("num3="+num3);
		
		boolean a4=false;
		int num4=10;
		if(a4&&(num2++>0)) {
			System.out.println("aaaa");
		}else {
			System.out.println("bbbb");
		}
		System.out.println("num4="+num4);
		
		// 区分|与||
		boolean a5=true;
		int num5=10;
		if(a5||(num5++>0)) {
			System.out.println("aaaa");
		}else {
			System.out.println("bbbb");
		}
		System.out.println("num5="+num5);
		
		boolean a6=true;
		int num6=10;
		if(a6||(num6++>0)) {
			System.out.println("aaaa");
		}else {
			System.out.println("bbbb");
		}
		System.out.println("num6="+num6);
		
		boolean a7=false;
		int num7=10;
		if(a7|(num7++>0)) {
			System.out.println("aaaa");
		}else {
			System.out.println("bbbb");
		}
		System.out.println("num7="+num7);
		
		boolean a8=false;
		int num8=10;
		if(a8||(num8++>0)) {
			System.out.println("aaaa");
		}else {
			System.out.println("bbbb");
		}
		System.out.println("num8="+num8);
		
		
		
	}

}
