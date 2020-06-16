package º¯Êý;

import java.util.Scanner;

public class ReturnMax {
	public static int max(int a,int b)
	{
		int res;
		if(a>b)
		{
			res=a;
		}
		else
		{
			res=b;
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int a=5;
		int b=6;
		int c;
		c=max(10,12);
		System.out.println(c);
		c=max(a,b);
		System.out.println(c);
		c=max(c,23);		
		System.out.println(c);
		c=max(c,max(10,12));
		System.out.println(c);
	}

}
