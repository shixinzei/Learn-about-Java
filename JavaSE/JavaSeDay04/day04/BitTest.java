package day04;

public class BitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12;
		System.out.println("num << 1 : "+(num<<1));
		System.out.println("num << 27 : "+(num<<27));
		System.out.println("num << 28 : "+(num<<28));
		
		num=-12;
		System.out.println("num << 1 : "+(num<<1));
		System.out.println("num << 27 : "+(num<<27));
		System.out.println("num << 28 : "+(num<<28));
		
		num=12;
		System.out.println("num >> 1 : "+(num>>1));
		System.out.println("num >> 2 : "+(num>>2));
		System.out.println("num >>> 1 : "+(num>>>1));
		num=-12;
		System.out.println("num >> 1 : "+(num>>1));
		System.out.println("num >>> 1 : "+(num>>>1));
		
		
		System.out.println("~6:"+(~6));
		System.out.println("~-7:"+(~-7));
		
		//��ϰ����������������ֵ
		int m=10;
		int n=5;
		System.out.println("m="+m+",n="+n);
		
		//��ʽһ��
		int t=m;
		m=n;
		n=t;
		System.out.println("m="+m+",n="+n);
		
		//��ʽ����
		//�ô���û�ж����м����
		//���������ܻ�����������Բ�
		m=m+n; 
		n=m-n;
		m=m-n;
		System.out.println("m="+m+",n="+n);
	
		//��ʽ����ʹ��Ϊ�������(m^n)^n=m;
		//�ô���û�ж����м����
		//�����������Բ��
		m=m^n;
		n=m^n;
		m=m^n;
		System.out.println("m="+m+",n="+n);
		
	}

}
