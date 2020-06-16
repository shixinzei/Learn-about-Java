package 循环;

import java.util.Scanner;

public class PrimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
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
			System.out.println(n+"是素数");
		}
		else
		{
			System.out.println(n+"不是素数");
		}
	}

}
