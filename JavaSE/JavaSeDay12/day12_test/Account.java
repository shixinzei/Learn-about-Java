package day12_test;

public class Account {
	private double balance;//余额


	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("存款成功："+amount);
		}
	}
	
	public void withdraw(double amount) {
		if(balance>amount) {
			balance-=amount;
			System.out.println("取款成功："+amount);
			return;
		}
		System.out.println("余额不足,取款失败");
	}
}
