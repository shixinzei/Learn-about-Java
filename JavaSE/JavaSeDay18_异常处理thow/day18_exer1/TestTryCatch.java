package day18_exer1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTryCatch {
	public static void main(String[] args) {
		try {
			int length = Integer.parseInt(args[0]);
			int[] arr = new int[length];
			
			Scanner in = new Scanner(System.in);
			for(int i=0;i<length;i++) {
				System.out.println("请输入第" + (i+1) + "个整数：");
				arr[i] = in.nextInt();
			}
			
			int max=arr[0];
			for(int i=1;i<arr.length;i++) {
				if(arr[i] > max) {
					max = arr[i];
				}
			}
			System.out.println("最大值为：" + max);
		}catch(NumberFormatException e) {
			System.out.println("命令行参数不是整数");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("命令行参数个数少于1");
		}catch(NegativeArraySizeException e) {
			System.out.println("数组的长度不能为负数");
		}catch(InputMismatchException e) {
			System.out.println("输入类型不匹配");
		}catch(Exception e) {
		
		}
	}
}
