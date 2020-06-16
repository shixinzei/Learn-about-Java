package 数据和对象的使用;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		// 遍历数组
		int[] data= {3,2,5,6,3,6,4};
		int x=in.nextInt();
		int loc=-1;
		boolean find=false;
		for(int i=0;i<data.length;i++)
		{
			if(x==data[i])
			{
				loc=i;
				break;
			}
		}
		// for each 循环
		for(int k:data)
		{
			if(k==x)
			{
				find=true;
				break;
			}
		}
		System.out.println(find);
		if(loc>-1)
		{
			System.out.println(x+"是第"+(loc+1)+"个");
		}
		else
		{
			System.out.println(x+"未找到");
		}
	}
}
