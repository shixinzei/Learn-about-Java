package day15_exer2;

public class Employee implements Comparable{
	private double salary;
	private String name;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(String name, double salary) {
		super();
		this.salary = salary;
		this.name = name;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Object o) {
		Employee em = (Employee) o;
		return (int) (this.salary - em.salary);
	}
	
	
}
