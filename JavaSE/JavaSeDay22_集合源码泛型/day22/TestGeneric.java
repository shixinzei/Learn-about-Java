package day22;

import java.util.ArrayList;

import org.junit.Test;

class MyArrayList<E>{
	private E[] arr;
}

public class TestGeneric {
	
	public int getMax(int a, int b) {
		return a>b?a:b;
	}
	
	@SuppressWarnings("all")
	
	@Test
	public void test2() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("zhangsan");
//		list.add(1); // 阻止 
		for(Object obj : list) {
			System.out.println(obj);
		}
		Object obj = list.get(0);
	}
	
	@Test
	public void test1() {
		ArrayList list = new ArrayList();
		list.add("zhangsan");
		list.add(1);
		for(Object obj : list) {
			System.out.println(obj);
		}
		Object obj = list.get(0);
	}
	
}
