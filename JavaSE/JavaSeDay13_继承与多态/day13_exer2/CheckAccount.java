package day13_exer2;

public class CheckAccount extends Account {
	private double overdraft;

	public CheckAccount(String id, double balance, double annualInterestRate, double overdraft) {
		super(id, balance, annualInterestRate);
		this.overdraft = overdraft;
	}

	public CheckAccount() {
		// TODO Auto-generated constructor stub
	}

	public double getOverdraft() {
		return overdraft;
	}
	
	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	@Override
	public void withdraw(double amount) {
		if(amount < 0) {
			System.out.println("输入有误！");
		}
		if(amount <= getBalance()) {
			setBalance(getBalance() - amount);
		}else if(amount <= getBalance() + overdraft) {
			overdraft -= amount - getBalance();
			setBalance(0);
		}else if(amount > getBalance() + overdraft) {
			System.out.println("超过可透支额度");
			
		}
		
	}
	
}
