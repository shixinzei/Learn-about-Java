package 初识Java;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int type = in.nextInt();
		switch(type)
		{
		case 1:
		case 2:
			System.out.println("你好");
			break;
		case 3:
			System.out.println("晚上好");
		case 4:
			System.out.println("再见");
			break;
		default:
			System.out.println("啊,什么啊？");
			break;
		}
	}

}
