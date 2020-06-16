package 数组;

import java.util.Scanner;

public class VoteCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int x;
		// 创建数组
		int[] nums=new int[10];
		x=in.nextInt();
		while(x!=-1)
		{
			if(x>=0&&x<=9)
			{
				nums[x]++;
			}
			x=in.nextInt();
		}
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(i+":"+nums[i]);
		}
	}

}
