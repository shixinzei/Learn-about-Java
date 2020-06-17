package day03;

public class SetValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=10;
		System.out.println(n1);
		int n2,n3;
		n2=n3=20;
		System.out.println(n2);
		System.out.println(n3);
		
		int n4=10,n5=20;
		System.out.println(n4);
		System.out.println(n5);
		
		int m=10;
		m+=3;
		System.out.println(m);
		m%=5;
		System.out.println(m);
		
		//特别的：
		short s1=10;
//		s1=s1+3; // 编译不通过
		s1=(short)(s1+3);
		System.out.println(s1);
		s1+=3;		
		System.out.println(s1);
		
		//练习：
		int n=10;
		n+=(n++)+(++n);
		System.out.println(n);
		
	}

}
