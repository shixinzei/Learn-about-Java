package day15_exer1;

public abstract class Employee {
	private int number;
	private String name;
	private MyDate birthday;
	public Employee(int number, String name, MyDate birthday) {
		super();
		this.number = number;
		this.name = name;
		this.birthday = birthday;
	}
	public Employee() {
		super();
	}
	public Employee(int number, String name, int year, int month, int day) {
		super();
		this.number = number;
		this.name = name;
		this.birthday = new MyDate(year,month,day);
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MyDate getBirthday() {
		return birthday;
	}
	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "Employee [number=" + number + ", name=" + name + ", birthday=" + birthday.toDateString() + "]";
	}
	public abstract double earnings(); 
	
}
