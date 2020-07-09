package day15_exer1;

public class HourlyEmployee extends Employee {
	private int hour;
	private double wage;

	public HourlyEmployee(int number, String name, MyDate birthday, int hour, double wage) {
		super(number, name, birthday);
		this.hour = hour;
		this.wage = wage;
	}


	public HourlyEmployee() {
		
	}

	public HourlyEmployee(int number, String name, int year, int month, int day) {
		super(number, name, year, month, day);

	}
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	@Override
	public double earnings() {
		return wage * hour;
	}

	@Override
	public String toString() {
		return super.toString() + "HourlyEmployee [hour=" + hour + ", wage=" + wage + "]";
	}
	
	

}
