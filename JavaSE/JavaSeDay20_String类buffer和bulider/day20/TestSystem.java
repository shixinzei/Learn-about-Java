package day20;

import org.junit.Test;

public class TestSystem {
	@Test
	public void test1() {
		String[] arr = new String[5];
		arr[0] = "hello";
		arr[1] = "java";
		arr[2] = "world";
		arr[3] = "string";
		arr[4] = "array";
		
		int total = 5;
		int index = 1;
		System.arraycopy(arr, index + 1, arr, index, total-index-1);
	
		arr[total-1] = null;
		total--;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
