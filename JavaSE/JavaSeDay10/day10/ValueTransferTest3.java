package day10;

public class ValueTransferTest3 {
	public void swap(Data data) {
		int temp=data.m;
		data.m=data.n;
		data.n=temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data=new Data();
		System.out.println("m="+data.m+",n="+data.n);
		
		ValueTransferTest3 test=new ValueTransferTest3();
		test.swap(data);
		System.out.println("m="+data.m+",n="+data.n);
		
		
	}
	
	
	

}

class Data{
	int m=10;
	int n=20;
}

