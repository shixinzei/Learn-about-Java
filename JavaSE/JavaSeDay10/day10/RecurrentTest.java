package day10;

public class RecurrentTest {
	public int getSum(int number) {
		if(number==1) {
			return 1;
		}else {
			return number+getSum(number-1);
		}
	}
	
	public int getResult(int number) {
		if(number==1) {
			return 1;
		}else {
			return number*getSum(number-1);
		}
	}
	
	public int func(int n) {
		if(n==0) {
			return 1;
		}else if(n==1) {
			return 4;
		}else {
			return func(n-1)*2+func(n-2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecurrentTest test=new RecurrentTest();
		int sum=test.getSum(100);
		System.out.println("sum="+sum);
		int res=test.getResult(10);
		System.out.println("res="+res);
		
	}

}
