package day07;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��������Ĭ�ϳ�ʼ��Ϊ��0
		int[] arr1=new int[4];
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		// ����������Ĭ�ϳ�ʼ��Ϊ��0.0
		double[] arr2=new double[4];
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr2[i]);
		}
		
		// �ַ�������Ĭ�ϳ�ʼ��Ϊ��'\u0000' 0
		char[] arr3=new char[4];
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr3[i]);
		}
		
		// ����������Ĭ�ϳ�ʼ��Ϊ��false
		boolean[] arr4=new boolean[4];
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr4[i]);
		}
		
		// ����������Ĭ�ϳ�ʼ��Ϊ��null ��ͬ��"null"
		String[] arr5=new String[4];
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr5[i]);
		}
	}

}
