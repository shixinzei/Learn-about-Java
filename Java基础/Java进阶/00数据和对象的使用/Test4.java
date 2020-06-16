package 数据和对象的使用;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int[] a= {1,2,3,4,5};
		int[] b=new int[a.length];
		for(int i=0;i<b.length;i++)
		{
			b[i]=a[i];
		}
		boolean isEqu=true;
		for(int i=0;i<b.length;i++)
		{
			if(a[i]!=b[i])
			{
				isEqu=false;
				break;
			}
		}
		System.out.println(a==b);	
		System.out.println(isEqu);
	}
}
