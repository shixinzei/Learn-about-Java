package day03;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello World";
		System.out.println(s1);
		String s2="";
		String s3="h";
		String s4="123";
		
		
		int i1=1;
		String s5 = s4 + i1; // +�����ӷ�
		System.out.println(s5);
		
		boolean b1=true;
		String s6=s1+b1;
		System.out.println(s6); //Hello Worldtrue
		
		//���ܽ������������͸�ֵΪ�ַ�������
//		String s7=i1; //���벻ͨ��
		String s7=i1+""; 
		System.out.println(s7); //"1"
		
//		int i2=(int)s7; //���ܽ��ַ�������ǿ��ת��Ϊ������������
		int i3=Integer.parseInt(s7); 
		System.out.println(i3);

		char c1=97;
		char c2='a';
		char c3='A';// 65
		System.out.println((int)c3);
		
//		long l=(long)i;
		char c4=5;
		char c5='5'; // 53
		System.out.println(c4);
		System.out.println((int)c5);
		
		
		
	}

}
