package day15;

public class Student implements Comparable{
	private String name;
	private int score;
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
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	@Override
	public int compareTo(Object o) {
		if(!(o instanceof Student)) {
			System.out.println("o不是学生对象");
			return 0;
		}
		Student stu = (Student) o;
		return this.score-stu.score;
	}
	
}
