package day08;

public class ArrayExer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int) (Math.random()*90)+10; // [10,99]
			System.out.print(arr[i]+" ");
		}
		int sum=0;
		double average;
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(arr[i]>max) max=arr[i];
		}
		average=sum*1.0/arr.length;
		System.out.println("sum£º"+sum);
		System.out.println("average£º"+average);
		System.out.println("max£º"+max);
	}

}
