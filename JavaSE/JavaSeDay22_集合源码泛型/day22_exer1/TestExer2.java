package day22_exer1;

import java.util.ArrayList;
import java.util.Iterator;

public class TestExer2 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(1, "张三", 67));
		list.add(new Student(2, "李四", 87));
		list.add(new Student(3, "王五", 77));
		list.add(new Student(4, "赵六", 69));
		
		for (Student student : list) {
			System.out.println(student);
		}
		System.out.println();
		Iterator<Student> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}

class Student{
	private int id;
	private String name;
	private int score;
	public Student(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
	
}