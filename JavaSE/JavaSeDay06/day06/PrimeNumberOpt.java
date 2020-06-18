package day06;

public class PrimeNumberOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();
		int cnt=0;
		boolean isPrime=true;
		for(int i=2;i<=100000;i++) {
			isPrime=true;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(" "+i);
				cnt++;
			}
		}
		long end=System.currentTimeMillis();
		System.out.println("cnt£º"+cnt);
		System.out.println("time:"+(end-start));
		
	}

}
