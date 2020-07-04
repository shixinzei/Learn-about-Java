package day13_exer1;

public class Manager extends Employee{
	private double bonus;

	public Manager() {
		super();
	}

	public Manager(String name, int age, double salary, double bonus) {
		super(name, age, salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public String getInfo() {
		return "������"+getName()+"������:"+getAge()+"��н��:"+getSalary()+"������"+bonus;
	}
	
}
