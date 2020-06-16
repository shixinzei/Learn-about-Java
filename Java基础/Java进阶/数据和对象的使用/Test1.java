package 数据和对象的使用;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int x;
		// 初始化数组
		int[] nums=new int[100];
		double sum=0;
		int cnt=0;
		x=in.nextInt();
		while(x!=-1)
		{
			nums[cnt]=x;
			sum+=x;
			cnt++;
			x=in.nextInt();
		}
		if(cnt>0)
		{
			double average=sum/cnt;
			for(int i=0;i<cnt;i++)
			{
				if(nums[i]>average)
				{
					System.out.println(nums[i]);
				}
			}
			System.out.println(sum/cnt);
	}
	}

}
