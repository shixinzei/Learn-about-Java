package day10;

public class ValueTransferTest2 {
	public void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������������Ϊ��
		int m=10;
		int n=20;
		System.out.println("m="+m);
		System.out.println("n="+n);
		// ������ʽһ��
//		int temp=m;
//		m=n;
//		n=temp;
//		System.out.println("m="+m);
//		System.out.println("n="+n);
		
		ValueTransferTest2 v=new ValueTransferTest2();
		v.swap(m,n);
		System.out.println("m="+m);
		System.out.println("n="+n);
		
	}
	
	
	

}

