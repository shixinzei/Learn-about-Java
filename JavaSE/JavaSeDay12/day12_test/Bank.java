package day12_test;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomers;
	
	public Bank() {
		customers=new Customer[10];
	}
	
	public void addCustomer(String f,String l) {
		if(numberOfCustomers<customers.length) {
			Customer customer=new Customer(f, l);
			customers[numberOfCustomers++]=customer;
		}else {
			System.out.println("银行客户已满");
		}
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	public Customer getCustomer(int index) {
		if(index>=0&&index<numberOfCustomers) {
			return customers[index];
		}
		return null;
	}
}


