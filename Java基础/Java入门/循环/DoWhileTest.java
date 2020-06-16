package Ñ­»·;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int cnt=0;
		do
		{
			cnt++;
			x/=10;
		}
		while(x>0);
		System.out.println(cnt);
	}

}
