package day21;

import java.util.LinkedList;

import org.junit.Test;

public class TestListImpl {
	@SuppressWarnings("all")
	
	@Test
	public void test2() {
		LinkedList list = new LinkedList();
		
		list.offerLast("1");
		list.offerLast("2");
		list.offerLast("3");
		list.offerLast("4");
		
//		list.offerFirst("1");
//		list.offerFirst("2");
//		list.offerFirst("3");
//		list.offerFirst("4");
		
		for(Object obj : list) {
			System.out.println(obj);
		}
		
	}
	
	@Test
	public void test1() {
		LinkedList list = new LinkedList();
		
		list.offerFirst("1");
		list.offerFirst("2");
		list.offerFirst("3");
		list.offerFirst("4");
		
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
}
