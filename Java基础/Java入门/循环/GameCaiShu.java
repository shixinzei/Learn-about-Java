package ѭ��;

import java.util.Scanner;

public class GameCaiShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int num=(int)(Math.random()*100+1);
		int a;
		int cnt=0;
		System.out.println("������һ����:");
		do{
			a=in.nextInt();
			cnt++;
			if(a>num)
			{
				System.out.println("ƫ��");
			}
			else if(a<num)
			{
				System.out.println("ƫС");
			}
		}while(a!=num);
		System.out.println("��ϲ��¶��ˣ������"+cnt+"��");
	}

}
