package day04;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("������������䣺");
		int age=in.nextInt();		
		System.out.println("age="+age);
		
		System.out.println("������������֣�");
		String name=in.next();
		System.out.println("name="+name);
		
		System.out.println("������������أ�");
		double weight=in.nextDouble();
		System.out.println("weight="+weight);
		
		System.out.println("�Ƿ�");
		boolean isOk=in.nextBoolean();
		System.out.println(isOk);
	}

}
