package day07;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		num1=0;
		// ����
		int[] arr1; 
		// ��̬��ʼ��
		arr1=new int[] {1,2,3,4};
		
		// ��̬��ʼ�����ϲ���������ʼ��
		int[] arr2=new int[] {4,5,6,7};
		
		// ��̬��ʼ��
		String[] arr3=new String[3];
		arr3[0]= "123";
		arr3[1]= "456";
		arr3[2]= "789";
//		System.out.println(arr3[0]);
//		System.out.println(arr3[1]);
//		System.out.println(arr3[2]);
		for(int i=0;i<3;i++) {
			System.out.println(arr3[i]);
		}
		
		// �����ƶ�
		int[] arr4= {1,2,3};
		System.out.println(arr4.length);
		
	}

}
