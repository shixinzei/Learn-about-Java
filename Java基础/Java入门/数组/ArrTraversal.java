package 数组;

import java.util.Scanner;

public class ArrTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int[] data= {2,3,4,12,6,24,66};
		int loc=-1;
		int x=in.nextInt();
		boolean find=false;
		for(int i=0;i<data.length;i++)
		{
			if(x==data[i])
			{
				loc=i;
				break;
			}
		}
		
		for(int k:data)
		{
			if(k==x)
			{
				find=true;
			}
		}
		System.out.println(find);
		if(loc>-1)
		{
			System.out.println(x+"是第"+(loc+1)+"个");
		}
		else
		{
			System.out.println(x+"不在其中");
		}
	}

}
