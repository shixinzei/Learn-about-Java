package ���ݺͶ����ʹ��;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		// �ַ���
		String s=new String("a string");
		System.out.println(s);
		
		// equals �Ƚ��Ƿ�����ͬ������
		System.out.println(s.equals("a string"));
		
		String ss=new String("hello");
		System.out.println(ss+" world");
		
		System.out.println(s+1+23);
		System.out.println(s+(1+23));
		
		String str1=in.nextLine();
		System.out.println(str1);
		
		String str2=in.next();
		System.out.println(str2);
	}
}
