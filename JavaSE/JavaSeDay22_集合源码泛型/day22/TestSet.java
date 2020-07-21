package day22;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestSet {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("张三");
		
		LinkedHashSet lset = new LinkedHashSet();
		lset.add("李四");
		
		TreeSet tset = new TreeSet();
		tset.add("王五");
	}
}
