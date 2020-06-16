package 使用对象;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		String s=new String("a string...");
		String str="hello";
		System.out.println(s);
		System.out.println(str);
		

		System.out.println(str+"world");
		System.out.println(s+1+23);
		
		String ss;
//		ss=in.next();
//		System.out.println(ss);
		ss=in.nextLine();
		System.out.println(ss);
		
		// 比较两个字符串用equals
		String s1="dsa";
		String s2="das";
		String s3="dsa";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}

}
