package day05;

import java.util.Scanner;

public class CountDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("please input month:");
		int month=in.nextInt();
		System.out.println("please input day:");
		int day=in.nextInt();
		int sumDays=0;
		switch(month) {
		case 12:
			sumDays+=30;
		case 11:
			sumDays+=31;
		case 10:
			sumDays+=30;
		case 9:
			sumDays+=31;
		case 8:
			sumDays+=31;
		case 7:
			sumDays+=30;
		case 6:
			sumDays+=31;
		case 5:
			sumDays+=30;
		case 4:
			sumDays+=31;
		case 3:
			sumDays+=31;
		case 2:
			sumDays+=31;
		case 1:
			sumDays+=day;
		}
		System.out.println("2020年"+month+"月"+day+"日是当前的第"+sumDays+"天");
	}

}
