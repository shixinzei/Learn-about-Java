package Ñ­»·;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		for(int n=2;n<100;n++)
		{
			int prime=1;
			for(int i=2;i<n;i++)
			{
				if(n%i==0) {
					prime=0;
					break;
				}
			}
			if(prime==1)
			{
				System.out.print(n+" ");
			}
		}
	}
}
