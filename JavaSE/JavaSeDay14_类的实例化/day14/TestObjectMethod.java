package day14;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class TestObjectMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = "hello";
		System.out.println(obj.getClass());
		
		TestObjectMethod t = new TestObjectMethod();
		System.out.println(t);
		System.out.println(t.toString());
		System.out.println(t.hashCode());
		
		String str = "对象的信息";
		str = str + t;
		System.out.println(str);
		
		Student stu = new Student("张三",23,89);
		System.out.println(stu);
		
		String str1 = "BB";
		String str2 = "Aa";
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Student stu1 = new Student("张三",23,89);
		Student stu2 = new Student("张三",23,89);
		System.out.println(stu1.equals(stu2));
		System.out.println(stu1 == stu2);
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入是否愿意：");
		String result = input.next();
//		if("愿意".equals(result)) {
//			System.out.println("太好了");
//		}
		if("愿意" == result) {
			System.out.println("太好了");
		}
		
		
		
	}

}

class Student{
	private String name;
	private int score;
	private int age;
	
	public Student() {
		super();
	}
	public Student(String name, int score, int age) {
		super();
		this.name = name;
		this.score = score;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
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
		if (age != other.age)
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