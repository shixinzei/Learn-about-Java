package day13_exer1;

public class Employee extends Person{
	private double salary;

	public Employee() {
		super();
	}

	public Employee(double salary) {
		super();
		this.salary = salary;
	}
	
	public Employee(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getInfo() {
		return "ĞÕÃû£º"+getName()+",ÄêÁä£º"+getAge()+",Ğ½×Ê"+salary;
	}
	
}
