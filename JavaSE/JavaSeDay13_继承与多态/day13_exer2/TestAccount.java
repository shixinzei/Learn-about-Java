package day13_exer2;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account("111", 20000, 0.045);
		a.withdraw(30000);
		System.out.println("Óà¶î£º" + a.getBalance());
		System.out.println();
		
		a.withdraw(2500);
		System.out.println("Óà¶î£º" + a.getBalance());
		System.out.println();
		
		a.deposit(3000);
		System.out.println("Óà¶î£º" + a.getBalance());
		System.out.println("ÔÂÀûÂÊ£º" + a.getMonthlyInterest()*100 + "%");
		System.out.println();
	}

}
