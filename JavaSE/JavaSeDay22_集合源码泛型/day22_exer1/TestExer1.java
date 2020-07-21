package day22_exer1;

import java.util.ArrayList;
import java.util.Iterator;

public class TestExer1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("赵六");
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println();
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
	}
}
