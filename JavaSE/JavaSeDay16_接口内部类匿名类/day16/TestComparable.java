package day16;

import java.util.Arrays;
import java.util.Comparator;

public class TestComparable {
	 public static void main(String[] args) {
		Student[] arr = new Student[3];
		arr[0] = new Student(2,"��С��",89);
		arr[1] = new Student(3,"����",87);
		arr[2] = new Student(1,"����",56);
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		class StudentSocreCompare implements Comparator{
			@Override
			public int compare(Object o1, Object o2) {
				Student s1 = (Student) o1;
				Student s2 = (Student) o2;
				return s1.getSocre()-s2.getSocre();
			}
		}
		StudentSocreCompare sc = new StudentSocreCompare();
		Arrays.sort(arr, sc);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		
	 }
}

class Student implements Comparable{
	private int id;
	private String name;
	private int socre;
	public Student(int id, String name, int socre) {
		super();
		this.id = id;
		this.name = name;
		this.socre = socre;
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
	public int getSocre() {
		return socre;
	}
	public void setSocre(int socre) {
		this.socre = socre;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", socre=" + socre + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		Student stu = (Student) o;
		return this.id - stu.id;
	}
}
