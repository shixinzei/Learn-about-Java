package day11_test;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������
		Person p1=new Person("hehe",5);
//		p1.eat();
//		p1.age=1;
		p1.show();
		
		
	}

}

class Person{
	String name;
	int age;
	
	// ������
	public Person(){
		System.out.println("Person()");
	}
	
	public Person(String n){
		name=n;
	}
	
	public Person(int a){
		age=a;
	}
	
	public Person(String n,int a){
		name=n;
		age=a;
	}
	
	public void eat() {
		System.out.println("����ʳ");
	}
	
	public void show() {
		System.out.println("name="+name+",age="+age);
	}
}