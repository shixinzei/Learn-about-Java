package day12_test;

public class Account {
	private double balance;//���


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
			System.out.println("���ɹ���"+amount);
		}
	}
	
	public void withdraw(double amount) {
		if(balance>amount) {
			balance-=amount;
			System.out.println("ȡ��ɹ���"+amount);
			return;
		}
		System.out.println("����,ȡ��ʧ��");
	}
}
