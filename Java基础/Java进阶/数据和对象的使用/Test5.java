package ���ݺͶ����ʹ��;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		// ��������
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
		// for each ѭ��
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
			System.out.println(x+"�ǵ�"+(loc+1)+"��");
		}
		else
		{
			System.out.println(x+"δ�ҵ�");
		}
	}
}
