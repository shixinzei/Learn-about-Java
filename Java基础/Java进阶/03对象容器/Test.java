package ¶ÔÏóÈİÆ÷;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		int[] ia=new int[10];
		String[] a=new String[10];
		System.out.println(ia[0]);
		System.out.println(a[0]);
		
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("first");
		ar.add("second");
		for(String s:ar)
		{
			System.out.println(s);
		}
	}
}
