package 初识Java;

import java.util.Scanner;

public class Fudianshu {
	public static void main(String[] args) {
		System.out.println(1.2-1.1);
		int foot;
		int inch;
		Scanner in = new Scanner(System.in);
		foot = in.nextInt();
		inch = in.nextInt();
//		System.out.println(foot);
//		System.out.println(inch);
		System.out.println((foot+(inch/12.0))*0.3048);
		// 强制类型转换
		System.out.println((int)((foot+(inch/12.0))*0.3048*100));
	}
}
