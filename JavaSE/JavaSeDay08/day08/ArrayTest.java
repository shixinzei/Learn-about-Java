package day08;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 一维初始化
		int[] arr=new int[] {1,2,3};
		// 静态初始化：数组的赋值和数组元素的赋值同时进行
		int[][] arr1=new int[][] {{1,2,3},{4,5},{7,8}};
		
		// 动态初始化:数组的赋值和数组元素的赋值分开进行
		// 动态初始化方式1：
		int[][] arr2=new int[3][2];
		// 动态初始化方式2：
		int[][] arr3=new int[3][];
		// 错误的初始化方式
//		int[][] arr4=new int[][4];
		arr3[0]=new int[3];
		arr3[1]=new int[4];
		arr3[2]=new int[5];
		
		System.out.println(arr1[1][0]);
		arr3[1][1]=1;
		
		//二维数组的长度
		System.out.println(arr1.length);
		System.out.println(arr1[0].length);
		System.out.println(arr1[1].length);
		System.out.println(arr1[2].length);
		
		// 二维数组的遍历
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
