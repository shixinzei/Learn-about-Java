package day10;
// жиди
public class OverloadTest {
	public void getSum(int i,int j) {
		System.out.println(i+j);;
	}
	
	public void getSum(double i,double j) {
		System.out.println(i+j);;
	}
	
	public void getSum(int i,int j,int k) {
		System.out.println(i+j+k);;
	}
	
	public void method(int i,String s) {
		System.out.println(i+s);
	}
	
	public void method(String s,int i) {
		System.out.println(i+s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadTest test=new OverloadTest();
		test.getSum(1, 2);
		
		
	}

}
