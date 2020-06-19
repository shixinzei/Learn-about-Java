package day07;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 整型数组默认初始化为：0
		int[] arr1=new int[4];
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		// 浮点型数组默认初始化为：0.0
		double[] arr2=new double[4];
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr2[i]);
		}
		
		// 字符型数组默认初始化为：'\u0000' 0
		char[] arr3=new char[4];
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr3[i]);
		}
		
		// 布尔型数组默认初始化为：false
		boolean[] arr4=new boolean[4];
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr4[i]);
		}
		
		// 引用型数组默认初始化为：null 不同于"null"
		String[] arr5=new String[4];
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr5[i]);
		}
	}

}
