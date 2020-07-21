package day22;

import java.util.ArrayList;

import org.junit.Test;

public class TestGenericType {
	@SuppressWarnings("all")
	
	@Test
	public void test2() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1); 
		for (Integer integer : list) {
			System.out.println(integer.getClass());
		}
	}
	
	@Test
	public void test1() {
		ArrayList list = new ArrayList();
		list.add(1); 
		for (Object object : list) {
			System.out.println(object.getClass());
		}
	}
}


class MyClass<T>{
	private T t;
//	private static T other;
//	private static void test(T t);
	public MyClass(T t) {
		super();
		this.t = t;
	}

	public MyClass() {
		super();
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "MyClass [t=" + t + "]";
	}
	
}

class Student implements Comparable<Student>{
	private int id;
	private String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student o) {
		
		return this.id-o.id;
	}
	
}

class XueYuan<T extends Number>{
	private T score;
	
}

class TestXueYuan{
	public void test() {
//		XueYuan<String> x = new XueYuan<String>();
		XueYuan<Integer> x1 = new XueYuan<Integer>();
		XueYuan<Double> x2 = new XueYuan<Double>();
	}
}