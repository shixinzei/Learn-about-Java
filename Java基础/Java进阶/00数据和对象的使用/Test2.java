package ���ݺͶ����ʹ��;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int x;
		// ��ʼ������
		double sum=0;
		int cnt=0;
		// ����ȷ������Ĵ�С
		cnt=in.nextInt();
		if(cnt>0)
		{
			int[] nums=new int[cnt];
			for(int i=0;i<nums.length;i++)
			{
				nums[i]=in.nextInt();
				sum+=nums[i];
			}
			double average=sum/cnt;
			for(int i=0;i<cnt;i++)
			{
				if(nums[i]>=average)
				{
					System.out.println(nums[i]);
				}
			}
			System.out.println(sum/cnt);
		}
	}

}
