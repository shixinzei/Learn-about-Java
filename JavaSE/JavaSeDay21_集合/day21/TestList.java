package day21;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.junit.Test;

public class TestList {
	@SuppressWarnings("all")
	
	@Test
	public void test5() {
		List list = new ArrayList();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("赵六");
		
		ListIterator listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			Object next = listIterator.next();
			System.out.println(next);
		}
		System.out.println();
		
		listIterator = list.listIterator(list.size());
		while(listIterator.hasPrevious()) {
			Object previous = listIterator.previous();
			System.out.println(previous);
		}
		System.out.println();
		
		listIterator = list.listIterator(3);
		while(listIterator.hasPrevious()) {
			Object previous = listIterator.previous();
			System.out.println(previous);
		}
		
		
	}
	
	@Test
	public void test4() {
		List list = new ArrayList();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		Object object = list.get(2);
		System.out.println(object);
	}
	
	@Test
	public void test3() {
		List list = new ArrayList();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		//修改
		list.set(0, "赵六");
		for(Object obj : list) {
			System.out.println(obj);
		}
		//查
		int index=list.indexOf("李四");
		System.out.println(index);
	}
	
	@Test
	public void test2() {
		List list = new ArrayList();
		list.add("张三");
		list.add(0, "李四");
		
		for(Object obj : list) {
			System.out.println(obj);
		}
		System.out.println();
		
		list.remove(1);
		
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
	
	@Test
	public void test1() {
		List list = new ArrayList();
		list.add("张三");
		list.add(0, "李四");
		
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
}
