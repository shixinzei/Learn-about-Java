package day11;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
//		p1.setAge(-1);
//		p1.setAge(15);
		System.out.println("年龄为："+p1.getAge());
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
//			throw new RuntimeException("输入的年龄不合法");
			System.out.println("输入的年龄不合法");
			return ;
		}
		this.age = age;
	}
	
}