package day06;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int sum=0;
		int cnt=0;
		do
		{
			if(i%2!=0) {
				System.out.println(i);
				sum+=i;
				cnt++;
			}
			i++;
		}while(i<=100);
		System.out.println("sum:"+sum);
		System.out.println("cnt:"+cnt);
		
		
	}

}
