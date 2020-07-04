package day13;

public class TestInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu1=new Student();
//		Student stu2=new Student("he",21);
		stu1.setAge(23);
		stu1.setName("hel");
		
		System.out.println(stu1.getInfo());
		
		stu1.setSocre(89);
		System.out.println("³É¼¨:"+stu1.getSocre());
		System.out.println(stu1.getInfo());
		
		Student stu2=new Student("hh",23,89);
		System.out.println(stu2.getInfo());
		
	}

}

