package day21;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class TestSet {
	@SuppressWarnings("all")
	
	@Test
	public void test6() {
		Set set = new LinkedHashSet();
		
		set.add(new Student(2,89,"张三"));
		set.add(new Student(1,82,"李四"));
		set.add(new Student(3,59,"王五"));
		set.add(new Student(4,88,"赵六"));
		
		set.add(new Student(2,89,"张三"));
		set.add(new Student(1,82,"李四"));
		set.add(new Student(3,59,"王五"));
		set.add(new Student(4,88,"赵六"));
		
		for(Object obj : set) {
			System.out.println(obj);
		}
	}
	
	@Test
	public void test5() {
		Set set = new HashSet();
		set.add("张三");
		set.add("李四");
		set.add("王五");
		set.add("赵六");
		set.add("张三");
		set.add("李四");
		set.add("王五");
		set.add("赵六");
		for(Object obj : set) {
			System.out.println(obj);
		}
	}
	
	@Test
	public void test4() {
		Set set = new LinkedHashSet();
		
		set.add(new Student(2,89,"张三"));
		set.add(new Student(1,82,"李四"));
		set.add(new Student(3,59,"王五"));
		set.add(new Student(4,88,"赵六"));
		
		for(Object obj : set) {
			System.out.println(obj);
		}
	}
	
	
	@Test
	public void test3() {
		Set set = new TreeSet();
		set.add("zhangsan");
		set.add("lisi");
		set.add("wangwu");
		set.add("zhaoliu");
		
		for(Object obj : set) {
			System.out.println(obj);
		}
	}
	
	@Test
	public void test2() {
		Set set = new TreeSet();
		
		set.add(new Student(2,89,"张三"));
		set.add(new Student(1,82,"李四"));
		set.add(new Student(3,59,"王五"));
		set.add(new Student(4,88,"赵六"));
		
		for(Object obj : set) {
			System.out.println(obj);
		}
	}
	
	@Test
	public void test1() {
		Set set = new HashSet();
		set.add("张三");
		set.add("李四");
		set.add("王五");
		set.add("赵六");
		
		for(Object obj : set) {
			System.out.println(obj);
		}
	}
}

