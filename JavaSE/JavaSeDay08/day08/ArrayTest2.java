package day08;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1=new int[3][2];
		
		// ���Ԫ��
		// ��ֵַ
		System.out.println(arr1[0]); 
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		// �ڲ�Ԫ��
		System.out.println(arr1[0][0]);
		
		int[][] arr4=new int[3][];
		//���Ԫ��
		System.out.println(arr4[0]); // null
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
		//�ڲ�Ԫ��
//		System.out.println(arr4[0][0]); // ����
		
		
	}

}
