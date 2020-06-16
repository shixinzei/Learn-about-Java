package 数据和对象的使用;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int[] scores= {87,98,69,54,65,76,87,99};
		System.out.println(scores.length);
		for(int i=0;i<scores.length;i++)
		{
			System.out.println(scores[i]+" ");
		}
	}

}
