package day11;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order=new Order();
		order.orderDefault=1;
		order.orderPublic=2;
//		order.orderPrivate=3;
		
		order.methodDefault();
		order.methodPublic();
//		order.methodPrivate();
		
		
	}

}
