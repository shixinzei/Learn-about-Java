package day08;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// һά��ʼ��
		int[] arr=new int[] {1,2,3};
		// ��̬��ʼ��������ĸ�ֵ������Ԫ�صĸ�ֵͬʱ����
		int[][] arr1=new int[][] {{1,2,3},{4,5},{7,8}};
		
		// ��̬��ʼ��:����ĸ�ֵ������Ԫ�صĸ�ֵ�ֿ�����
		// ��̬��ʼ����ʽ1��
		int[][] arr2=new int[3][2];
		// ��̬��ʼ����ʽ2��
		int[][] arr3=new int[3][];
		// ����ĳ�ʼ����ʽ
//		int[][] arr4=new int[][4];
		arr3[0]=new int[3];
		arr3[1]=new int[4];
		arr3[2]=new int[5];
		
		System.out.println(arr1[1][0]);
		arr3[1][1]=1;
		
		//��ά����ĳ���
		System.out.println(arr1.length);
		System.out.println(arr1[0].length);
		System.out.println(arr1[1].length);
		System.out.println(arr1[2].length);
		
		// ��ά����ı���
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
