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
				System.out.println("�������" + (i+1) + "��������");
				arr[i] = in.nextInt();
			}
			
			int max=arr[0];
			for(int i=1;i<arr.length;i++) {
				if(arr[i] > max) {
					max = arr[i];
				}
			}
			System.out.println("���ֵΪ��" + max);
		}catch(NumberFormatException e) {
			System.out.println("�����в�����������");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�����в�����������1");
		}catch(NegativeArraySizeException e) {
			System.out.println("����ĳ��Ȳ���Ϊ����");
		}catch(InputMismatchException e) {
			System.out.println("�������Ͳ�ƥ��");
		}catch(Exception e) {
		
		}
	}
}
