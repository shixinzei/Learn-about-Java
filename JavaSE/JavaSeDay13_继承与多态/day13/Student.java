package day13;

public class Student extends Person{
	//��չ����û�е�����
	private int score;
	public Student() {
//		super(); //���ø����޲ι���
	}
	public Student(String name,int age,int score) {
		//��ʾ���ø�����вι���
		super(name,age);
		this.score=score;
	}
	
	//��չ����û�еķ���
	public int getSocre() {
		return score;
	}
	public void setSocre(int score) {
		this.score = score;
	}
	public String getInfo() {
		return "������"+getName()+"�����䣺"+getAge()+"���ɼ���"+score;
	}
}
