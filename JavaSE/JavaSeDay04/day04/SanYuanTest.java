package day04;

public class SanYuanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ȡ�����������ֵ
		int m=10;
		int n=5;
		int max=(int) ((m>n)?m:(n+0.0));
		System.out.println(max);
		
		String maxStr=(m>n)?"m��":((m==n)?"���":"n��");
		System.out.println(maxStr);
		
		if(m>n) {
			System.out.println("m");
		}else {
			System.out.println("n");
		}
		
		// ��ȡ�������е����ֵ
		int n1=12,n2=43,n3=2;
		int max1=(n1>n2)?n1:n2;
		int maxx=(max1>n3)?max1:n3;
		System.out.println("���ֵΪ��"+maxx);
		// ����Ƕ��
		int maxx1=(((n1>n2)?n1:n2)>n3?((n1>n2)?n1:n2):n3);
		System.out.println("���ֵΪ��"+maxx1);
		
	}

}
