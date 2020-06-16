package 循环;

import java.util.Scanner;

public class CountAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int number;
		int sum=0;
		int cnt=0;
		number=in.nextInt();
		while(number!=-1)
		{
			sum+=number;
			cnt++;
			number=in.nextInt();
		}
		if(cnt>0)
		{
			System.out.println("平均数="+(double)sum/cnt);	
		}
	}

}
