package ¶ÔÏóÈİÆ÷;

import java.util.ArrayList;
import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("first");
		ar.add("second");
		ar.add("first");
		for(String s:ar)
		{
			System.out.println(s);
		}
		System.out.println(ar);
		System.out.println("------------");
		HashSet<String> hs=new HashSet<String>();
		hs.add("first");
		hs.add("second");
		hs.add("first");
		for(String s:hs)
		{
			System.out.println(s);
		}
		System.out.println(hs);
		
		Value v=new Value();
		v.set(10);
		System.out.println(v);
	}

}
