package ����;

import java.util.Scanner;

public class Arr {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int x;
		// ��������
		int []nums=new int[100];
		double sum=0;
		int cnt=0;
		x=in.nextInt();
		while(x!=-1)
		{
			// ����Ԫ�ظ�ֵ
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
