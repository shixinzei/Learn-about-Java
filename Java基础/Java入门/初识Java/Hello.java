package 初识Java;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		System.out.println("你好");
		
		// 输入
		Scanner in = new Scanner(System.in);
//		System.out.println("echo:" + in.nextLine());
//		System.out.println("2+3="+5);
//		System.out.println(2+3+"=2+3="+(2+3));
		
		// 变量
		int price = 0;
		// 常量 final int
		int amount = 100; 
//		System.out.print(price);
		
		System.out.println("请输入amount:");
		// 赋值
		amount = in.nextInt();
		System.out.println("请输入price:");
		// 赋值
		price = in.nextInt();
		System.out.println(amount+"-"+price+"="+(amount-price));	
		
	}
	
}
