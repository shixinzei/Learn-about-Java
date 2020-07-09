package day15_exer1;

import java.util.Scanner;

public class Payrollsystem {

	public static void main(String[] args) {
		Employee[] arr = new Employee[3];
		arr[0] = new SalariedEmployee(12, "hehe", new MyDate(1998,7,22), 25000, 28, 30);
		arr[1] = new SalariedEmployee(111, "wy",1997, 2, 2, 200000, 30, 31);
		arr[2] = new HourlyEmployee(1111, "dd", new MyDate(1999,2,1), 100, 365);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			System.out.println(arr[i].earnings());
		}
		
		System.out.println("-------");
		
		Scanner in = new Scanner(System.in);
		System.out.println("请输入本月的月份");
		int month = in.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getBirthday().getMonth() == month) {
				System.out.println(arr[i].earnings()+100);
			}else {
				System.out.println(arr[i].earnings());
			}
		}
		
	}

}
