package Ñ­»·;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int cnt=0;
		while(x>0) {
			cnt++;
			x/=10;
		}
		System.out.println(cnt);
	}

}
