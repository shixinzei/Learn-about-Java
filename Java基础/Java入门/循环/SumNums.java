package Ñ­»·;

import java.util.Scanner;

public class SumNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		double sum=0.0;
		for(int i=1;i<=n;i++) {
			sum+=1.0/i;
		}
		System.out.println(sum);
		System.out.printf("%.2f", sum);
	}

}
