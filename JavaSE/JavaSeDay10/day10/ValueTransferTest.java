package day10;

public class ValueTransferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 基本数据类型为例
		int m=10;
		int n=m;
		System.out.println(n);
		
		n=20;
		System.out.println(m);
		
		//引用类型为例
		Order o1=new Order();
		o1.orderId=1001;
		
		Order o2=o1;
		System.out.println(o2.orderId); //1001
		
		o2.orderId=1002;
		System.out.println(o1.orderId); //1002
	}

}

class Order{
	int orderId;
}
