package 循环;

import java.util.Scanner;

public class GameCaiShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int num=(int)(Math.random()*100+1);
		int a;
		int cnt=0;
		System.out.println("请输入一个数:");
		do{
			a=in.nextInt();
			cnt++;
			if(a>num)
			{
				System.out.println("偏大");
			}
			else if(a<num)
			{
				System.out.println("偏小");
			}
		}while(a!=num);
		System.out.println("恭喜你猜对了，你猜了"+cnt+"次");
	}

}
