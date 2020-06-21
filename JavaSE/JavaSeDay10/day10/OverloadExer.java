package day10;

public class OverloadExer {
	public void mOL(int ele) {
		System.out.println(ele*ele);
	}
	
	public void mOL(int ele1,int ele2) {
		System.out.println(ele1*ele2);
	}
	
	public void mOL(String ele) {
		System.out.println(ele);
	}
	
	public void max(int i,int j) {
		int max=(i>j)?i:j;
		System.out.println("max="+max);
	}
	
	public void max(double i,double j) {
		double max=(i>j)?i:j;
		System.out.println("max="+max);
	}
	
	public void max(double i,double j,double k) {
		double max=(i>j)?i:j;
		double maxx=(max>k)?max:k;
		System.out.println("max="+maxx);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadExer test=new OverloadExer();
		test.mOL(12);
		test.max(12.1, 13.4);
		test.max(12, 45);
		
		
		
	}

}
