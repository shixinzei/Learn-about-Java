package ��ʶJava;

import java.util.Scanner;

public class Comparenums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner in = new Scanner(System.in);
		System.out.println("��������������");
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		int max;
		if(x>y)
		{
			if(x>z)
			{
				max=x;
			}
			else
			{
				max=z;
			}
		}
		else 
		{
			if(y>z)
			{
				max=y;
			
			}
			else
			{
				max=z;
			}
		}
		System.out.println(max);
	}

}
