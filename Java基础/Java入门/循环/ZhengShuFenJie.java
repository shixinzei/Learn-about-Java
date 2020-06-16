package Ñ­»·;

import java.util.Scanner;

public class ZhengShuFenJie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int number;
		number=in.nextInt();
		int res=0;
		do{
			int digit=number%10;
			res=res*10+digit;
			number/=10;
		}while(number>0);
		System.out.println(res);
	}

}
