package ���ݺͶ����ʹ��;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		// �ַ�������
		String s1="abc";
		String s2="abb";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.length());
		System.out.println(s1+s2);
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(s1.charAt(i));
		}
		
		// �Ӵ�substring
		String ss="0123456789����";
		System.out.println(ss.substring(2));
		System.out.println(ss.substring(2,5));
		System.out.println(ss.indexOf('9'));
	}
}
