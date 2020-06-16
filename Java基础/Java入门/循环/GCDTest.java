package 循环;

import java.util.Scanner;

public class GCDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int res=1;
		int oa=a;
		int ob=b;
//		for(int i=2;i<=a&&i<=b;i++)
//		{
//			if(a%i==0&&b%i==0)
//			{
//				res=i;
//			}
//		}
//		System.out.println(oa+"和"+ob+"最大公约数为："+res);
		while(b!=0)
		{
			int r=a%b;
			System.out.println(a+","+b+","+r);
			a=b;
			b=r;
		}
		System.out.println(oa+"和"+ob+"最大公约数为："+a);
	}

}
