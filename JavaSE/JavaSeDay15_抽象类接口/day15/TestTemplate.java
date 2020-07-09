package day15;

import java.util.Random;

public class TestTemplate {
	public static void main(String[] args) {
		CallTime ct = new MyCallTime();
		System.out.println("耗时：" + ct.getTime() + "毫秒");
		CallTime mct = new OtherCallTime();
		System.out.println("耗时：" + mct.getTime() + "毫秒");
	}
	
}

abstract class CallTime{
	public long getTime() {
		long start = System.currentTimeMillis();
		
		doWork();
		
		long end = System.currentTimeMillis();
		
		return end - start;
	}
	
	protected abstract void doWork();
}

class MyCallTime extends CallTime{

	@Override
	protected void doWork() {
		long sum = 0;
		for(int i=0;i<100000;i++) {
			sum += i;
		}
		System.out.println("1-100000的累加和：" + sum);
	}
	
}

class OtherCallTime extends CallTime{

	@Override
	protected void doWork() {
		Random r = new Random();
		int[] arr = new int[10];
		for(int i=0;i<10;i++) {
			arr[i] = r.nextInt(100);
		}
		
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j+1] < arr[j]) {
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
}

