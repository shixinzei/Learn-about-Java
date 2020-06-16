package 数据和对象的使用;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		// 字符串操作
		String s1="abc";
		String s2="abb";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.length());
		System.out.println(s1+s2);
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(s1.charAt(i));
		}
		
		// 子串substring
		String ss="0123456789中文";
		System.out.println(ss.substring(2));
		System.out.println(ss.substring(2,5));
		System.out.println(ss.indexOf('9'));
	}
}
