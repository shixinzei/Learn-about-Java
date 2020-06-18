package day05;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println("Hello World");
		}
		
		int num=1;
		for(System.out.print('a');num<=3;System.out.print('c'),num++) {
			System.out.print('b');
		}
		System.out.println();
		
		int sum=0;
		int cnt=0;
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i);
				sum+=i;
				cnt++;
			}
		}
		System.out.println("sum="+sum);
		System.out.println("cnt="+cnt);
	}

}
