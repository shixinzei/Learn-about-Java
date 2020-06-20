package day09;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
//		for(int i=0;i<=arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr.length);
		
//		System.out.println(arr[arr.length]);
//		System.out.println(arr[-1]);
		
		int[] arr1=new int[4];
		arr1=null;
//		System.out.println(arr1[0]);
		
		int[][] arr2=new int[3][];
//		System.out.println(arr2[1][0]);
		
		String[] arr3=new String[3];
//		System.out.println(arr3[0].toString());
	}

}
