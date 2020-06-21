package day10;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		p1.name="dj";
		p1.age=20;
		p1.sex=1;
		
//		p1.showAge(30);
		
		p1.study();
		p1.showAge();
		int age=p1.addAge(2);
		System.out.println("new age:"+age);
		p1.showAge();
		
		Person p2=new Person();
		p2.name="june";
		p2.age=25;
		p2.showAge();
		
		
	}

}

class Person{
	String name; 
	int age;
	int sex; // 0:女 1:男 2:不确定
	
	public void study() {
		System.out.println("studying");
	}
	
//	public void showAge(int age) {
//		System.out.println("age="+age);
//	}
	
	public void showAge() {
		System.out.println("age="+age);
	}
	
	public int addAge(int a) {
		age+=a;
		return age;
	}
}