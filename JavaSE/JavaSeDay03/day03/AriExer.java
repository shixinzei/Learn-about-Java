package day03;

import java.util.Scanner;

public class AriExer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int a;
		int b;
		int c;
		a = num / 100;
		b = (num / 10) % 10;
		c = num % 10;
		System.out.println("个位数：" + c);
		System.out.println("十位数：" + b);
		System.out.println("百位数：" + a);
	}
}
