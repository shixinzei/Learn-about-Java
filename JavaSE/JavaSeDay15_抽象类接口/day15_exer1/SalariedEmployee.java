package day15_exer1;

public class SalariedEmployee extends Employee {
	private double monthlySalary;
	private int workingDay;
	private int totalDays;
	
	
	public SalariedEmployee(int number, String name, MyDate birthday) {
		super(number, name, birthday);

	}

	public SalariedEmployee(int number, String name, MyDate birthday, double monthlySalary, int workingDay,
			int totalDays) {
		super(number, name, birthday);
		this.monthlySalary = monthlySalary;
		this.workingDay = workingDay;
		this.totalDays = totalDays;
	}
	
	public SalariedEmployee(int number, String name, int year, int month, int day, double monthlySalary, int workingDay,
			int totalDays) {
		super(number, name, new MyDate(month, year, day));
		this.monthlySalary = monthlySalary;
		this.workingDay = workingDay;
		this.totalDays = totalDays;
	}
	
	public SalariedEmployee() {
	}

	public SalariedEmployee(int number, String name, int year, int month, int day) {
		super(number, name, year, month, day);

	}
	
	
	@Override
	public double earnings() {
		return monthlySalary * workingDay / totalDays;
	}

	@Override
	public String toString() {
		return super.toString() + "SalariedEmployee [monthlySalary=" + monthlySalary + ", workingDay=" + workingDay + ", totalDays="
				+ totalDays + "]";
	}
	
}
