package day06;

import java.util.Scanner;

public class ForBreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("input first num:");
		int num1=sc.nextInt();
		System.out.println("input second num:");
		int num2=sc.nextInt();
		
		int min=(num1>num2)?num2:num1;
		int max=(num1>num2)?num1:num2;
		
		for(int i=min;i>=1;i--) {
			if(num1%i==0&&num2%i==0) {
				System.out.println("公约数为："+i);
				break;
			}
		}
		
		
		for(int i=max;i<=num1*num2;i++) {
			if(i%num1==0&&i%num2==0) {
				System.out.println("公倍数为："+i);
				break;
			}
		}
		
	}

}
