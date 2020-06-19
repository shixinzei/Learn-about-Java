package day08;

public class ArrayExer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr=new String[] {"aa","bb","cc","dd"};
		String[] arr1=new String[arr.length];
		// 复制
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		// 反转方式一
//		for(int start=0,end=arr.length-1;start<end;start++,end--) {
//			String temp=arr[start];
//			arr[start]=arr[end];
//			arr[end]=temp;
//		}
		// 反转方式二
//		for(int i=0;i<arr.length/2;i++) {
//			String temp=arr[i];
//			arr[i]=arr[arr.length-1-i];
//			arr[arr.length-1-i]=temp;
//		}
		// 反转方式三
		String[] arr2=new String[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[arr.length-1-i];
			System.out.print(arr2[i]+"\t");
		}
		System.out.println();
		
		// 遍历
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		// 查找（或搜索
		// 方式一：线性查找
		String str="bb";
		boolean isFlag=true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(str)) {
				System.out.println(i+1);
				isFlag=false;
				break;
			}
		}
		if(isFlag) {
			System.out.println("not found");
		}
		
		//方式二：二分法查找
		//前提：数组要有序
		
		
		
	}

}
