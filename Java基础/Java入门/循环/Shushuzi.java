package 循环;

import java.util.Scanner;

public class Shushuzi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 确定某数的位数
		Scanner in = new Scanner(System.in);
		int num=in.nextInt();
		int cnt=0;
		while(num!=0)
		{
			cnt++;
			num/=10;
		}
		System.out.println(cnt);
	}

}
