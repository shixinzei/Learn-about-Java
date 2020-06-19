package day08;

public class ArrayExer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1,array2,array3;
		array1=new int[] {2,3,4,5,8,9};
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+"\t");
		}
		System.out.println();
		//赋值array2变量等于array1
		array2=array1;
		System.out.println(array1);
		System.out.println(array2);
		
		array3=new int[array1.length];
		for(int i=0;i<array1.length;i++) {
			array3[i]=array1[i];
		}
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+"\t");
		}
		System.out.println();
		System.out.println(array1);
		System.out.println(array3);
		
		//修改array2
		for(int i=0;i<array2.length;i++) {
			if(i%2==0) {
				array2[i]=i;
			}
		}
		
		//遍历array1
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+"\t");
		}
		System.out.println();
		
	}

}
