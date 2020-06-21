package day12_test;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new Bank();
		bank.addCustomer("aa", "aaa");
		bank.addCustomer("bb", "bbb");
		bank.addCustomer("cc", "ccc");
		
		bank.getCustomer(0).setAccount(new Account(1000));
		bank.getCustomer(1).setAccount(new Account(1001));
//		bank.getCustomer(2).setAccount(new Account(1002));
		
		for(int i=0;i<bank.getNumberOfCustomers();i++) {
			Customer customer=bank.getCustomer(i);
			System.out.println(customer);
			Account account=bank.getCustomer(i).getAccount();
			if(account==null) {
				customer.setAccount(new Account(0));
			}
			System.out.println(customer.getFirstName()+","+customer.getLastName()+
					","+customer.getAccount().getBalance());
		}
	}

}
