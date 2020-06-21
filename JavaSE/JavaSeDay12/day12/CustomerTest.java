package day12;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer=new Customer("Jane", "Smith");
		Account account=new Account(1000, 2000,0.0123);
		customer.setAccount(account);
		customer.getAccount().deposit(100);
		customer.getAccount().withdraw(996);
		customer.getAccount().withdraw(1000);
		System.out.println(customer.getFirstName()+customer.getLastName()+
				customer.getAccount().getId()+customer.getAccount().getBalance()
				+customer.getAccount().getAnnualInterestRate());
	}

}
