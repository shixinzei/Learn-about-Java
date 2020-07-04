package day13;

public class Student extends Person{
	//扩展父类没有的属性
	private int score;
	public Student() {
//		super(); //调用父类无参构造
	}
	public Student(String name,int age,int score) {
		//显示调用父类的有参构造
		super(name,age);
		this.score=score;
	}
	
	//扩展父类没有的方法
	public int getSocre() {
		return score;
	}
	public void setSocre(int score) {
		this.score = score;
	}
	public String getInfo() {
		return "姓名："+getName()+"，年龄："+getAge()+"，成绩："+score;
	}
}
