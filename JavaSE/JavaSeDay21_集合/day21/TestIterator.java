package day21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

public class TestIterator {
	@Test
	public void test1() {
		Collection c = new ArrayList();
		c.add("张三");
		c.add("李四");
		c.add("王五");
		c.add("赵七");
		
		Iterator iterator = c.iterator();
		while(iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println(next);
		}
		
	}
	
	
	@Test
	public void test2() {
		Collection c = new ArrayList();
		c.add(new Student(1, 80, "张三"));
		c.add(new Student(2, 52, "李四"));
		c.add(new Student(3, 85, "王五"));
		
//		c.remove(o);
//		for(Object obj : c) {
//			Student stu = (Student) obj;
//			if(stu.getScore()<60) {
//				c.remove(stu);
//			}
//		}
//		for(Object obj : c) {
//			Student stu = (Student) obj;
//			System.out.println(stu);
//		}
		
		Iterator iterator = c.iterator();
		while(iterator.hasNext()) {
			Object next=iterator.next();
			Student stu = (Student) next;
			if(stu.getScore()<60) {
				iterator.remove();
			}
		}
		for(Object obj : c) {
			System.out.println(obj);
		}
	}
}

class Student implements Comparable{
	private int id;
	private int score;
	private String name;
	public Student(int id, int score, String name) {
		super();
		this.id = id;
		this.score = score;
		this.name = name;
	}
	public Student() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", score=" + score + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Object o) {
		Student stu = (Student) o;
		return this.id-stu.id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
	
}