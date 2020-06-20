package day09;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer();
		c1.show1();
//		c1.show2();
		
		
		
	}

}

class Customer{
	String name=null;
	int age=1;
	
	public void show1() {
		
	}
	
//	private void show2() {	
//		
//	}
	
	public int getAge() {
		return age;
	}
	
	public String eat(String food1,String food2,String food3) {
		return food1+food2+food3;
	}
	
	private void showNation(String nation) {
		System.out.println("À´×ÔÓÚ"+nation);
	}
}