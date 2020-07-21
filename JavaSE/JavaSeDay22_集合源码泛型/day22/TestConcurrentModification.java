package day22;

import java.util.ArrayList;
import java.util.Iterator;

public class TestConcurrentModification {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("赵六");
		list.add("钱七");
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Object next = iterator.next();
			list.remove(next);
		}
		iterator = list.iterator();
		while(iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println(next);
		}
		
	}
}
