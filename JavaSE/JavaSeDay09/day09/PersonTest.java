package day09;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ʵ����
		Scanner sc=new Scanner(System.in);
		Person p1=new Person();
		
		System.out.println(p1);
		p1.name="hehe";
		p1.age=21;
		System.out.println("name:"+p1.name);
		System.out.println("age:"+p1.age);
			
		p1.showNation("CHN");
		
		Person p2=new Person();
		System.out.println(p2.name+" "+p2.age);
		
	}	

}


class Person{
	String name=null;
	int age=1;
	
	public void eat() {
		System.out.println("�Է�");
	}
	
	public void study() {
		System.out.println("ѧϰ");
	}
	
	public void showNation(String nation) {
		System.out.println("������:"+nation);
	}
}