package day11;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
//		p1.setAge(-1);
//		p1.setAge(15);
		System.out.println("����Ϊ��"+p1.getAge());
	}

}

class Person{
	private int age;
	
	public Person() {
		age=18;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<0||age>130) {
//			throw new RuntimeException("��������䲻�Ϸ�");
			System.out.println("��������䲻�Ϸ�");
			return ;
		}
		this.age = age;
	}
	
}