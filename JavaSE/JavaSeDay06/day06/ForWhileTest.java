package day06;

import java.util.Scanner;

public class ForWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int cnt1=0,cnt2=0;
		
		//for(;;)
		while(true) {
			System.out.println("input num£º");
			int num=sc.nextInt();
			if(num==0) break;
			if(num>0) cnt1++;
			else cnt2++;
		}
		System.out.println("cnt1:"+cnt1);
		System.out.println("cnt2:"+cnt2);
		
	}

}
