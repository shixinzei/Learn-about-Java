package day15_exer2;

import java.util.Arrays;

public class TestEmployee {
	public static void main(String[] args) {
		Employee[] arr = new Employee[5];
		arr[0] = new Employee("����",13000);
		arr[1] = new Employee("����",15000);
		arr[2] = new Employee("����",14000);
		arr[3] = new Employee("����",17000);
		arr[4] = new Employee("����",12000);
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
