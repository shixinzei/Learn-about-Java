package day22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

import org.junit.Test;

public class TestIterator {
	
	@Test
	public void test3() {
		LinkedList list = new LinkedList();
		Iterator iterator = list.iterator();
		
	}
	
	
	@Test
	public void test2() {
		Vector list = new Vector();
		Iterator iterator = list.iterator();
		
	}
	
	@Test
	public void test1() {
		ArrayList list = new ArrayList();
		Iterator iterator = list.iterator();
		
	}
}
