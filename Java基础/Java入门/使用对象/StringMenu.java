package 使用对象;

import java.util.Scanner;

public class StringMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		String s1="abc";
		String s2="abb";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.length());
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(2));
		for(int i=0;i<s1.length();i++) 
		{
			System.out.println(s1.charAt(i));
		}
		String ss="01234567哈哈";
		System.out.println(ss.substring(2));
		System.out.println(ss.substring(2,4));
		System.out.println(ss.indexOf('2'));
		
	}

}
