package Ñ­»·;

import java.util.Scanner;

public class ForTest {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n =in.nextInt();
		int i=1;
		int factor=1;
//		while(i<=n)
//		{
//			factor*=i;	
//			i++;
//		}
		for(i=1;i<=n;i++) {
			factor*=i;
		}
		System.out.println(factor);
	}
}
