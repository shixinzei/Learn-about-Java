package day13_exer1;

public class TestExer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("张三", 23);
		System.out.println(p.getInfo());
		
		Employee e = new Employee("李四", 24, 10000);
		System.out.println(e.getInfo());
		System.out.println(p.getInfo());
		
		Manager m = new Manager("王五", 25, 15000, 10000);
		System.out.println(m.getInfo());
		
		
	}

}
