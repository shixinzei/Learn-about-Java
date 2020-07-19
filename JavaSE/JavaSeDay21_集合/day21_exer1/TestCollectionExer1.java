package day21_exer1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollectionExer1 {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		Collection coll = new ArrayList();
		coll.add(new Employee("张三", 12000));
		coll.add(new Employee("李四", 13000));
		coll.add(new Employee("王五", 14000));
		coll.add(new Employee("赵六", 15000));
		
		boolean flag = coll.contains(new Employee("张三", 12000));
		System.out.println(flag);
		
		Object[] array = coll.toArray();
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		for(Object obj : array) {
			System.out.println(obj);
		}
		System.out.println();
		Iterator iterator = coll.iterator();
		while(iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println(next);
		}
		
	}
}
