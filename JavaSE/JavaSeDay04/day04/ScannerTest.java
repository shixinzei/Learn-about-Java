package day04;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("请输入你的年龄：");
		int age=in.nextInt();		
		System.out.println("age="+age);
		
		System.out.println("请输入你的名字：");
		String name=in.next();
		System.out.println("name="+name);
		
		System.out.println("请输入你的体重：");
		double weight=in.nextDouble();
		System.out.println("weight="+weight);
		
		System.out.println("是否");
		boolean isOk=in.nextBoolean();
		System.out.println(isOk);
	}

}
