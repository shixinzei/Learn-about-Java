package day09;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= new int[] {1,3,2,4};
		int[] arr2= new int[] {1,3,2,4};
		boolean isEquals=Arrays.equals(arr1, arr2);
		System.out.println(isEquals);
		
		
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		

		System.out.println(Arrays.binarySearch(arr1, 2));
		System.out.println(Arrays.binarySearch(arr1, 3));
		
		Arrays.fill(arr1, 3);
		System.out.println(Arrays.toString(arr1));
		
	}

}
