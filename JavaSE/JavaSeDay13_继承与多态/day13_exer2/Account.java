package day13_exer2;

public class Account {
	private String id;
	private double balance;
	private double annualInterestRate;
	public Account(String id, double balance, double annualInterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	public Account() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public double getMonthlyInterest() {
		return annualInterestRate/12;
	}
	public void withdraw(double amount) {
		if(amount < 0) {
			System.out.println("输入有误！");
		}
		if(amount > balance) {
			System.out.println("余额不足！");
		}else {
			balance -= amount;
		}
	}
	public void deposit (double amount) {
		balance += amount;
		if(amount < 0) {
			System.out.println("输入有误！");
		}
	}
}
