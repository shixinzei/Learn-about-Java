package ��ʶJava;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		System.out.println("���");
		
		// ����
		Scanner in = new Scanner(System.in);
//		System.out.println("echo:" + in.nextLine());
//		System.out.println("2+3="+5);
//		System.out.println(2+3+"=2+3="+(2+3));
		
		// ����
		int price = 0;
		// ���� final int
		int amount = 100; 
//		System.out.print(price);
		
		System.out.println("������amount:");
		// ��ֵ
		amount = in.nextInt();
		System.out.println("������price:");
		// ��ֵ
		price = in.nextInt();
		System.out.println(amount+"-"+price+"="+(amount-price));	
		
	}
	
}
