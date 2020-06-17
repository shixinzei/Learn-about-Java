package day03;

public class ArithmeticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 除法：/
		int i1=12;
		int i2=5;
		int i3=i1/i2;
		System.out.println(i3); // 2
		
		int i4=i1/i2*i2;
		System.out.println(i4); // 10
		
		double d1=i1/i2;
		System.out.println(d1); // 2.0
		
		double d2=i1;
		System.out.println(d2); // 12.0
		
		double d3=(double)i1/i2;
		System.out.println(d3); // 2.4
		
		double d4=i1/(i2+0.0);
		System.out.println(d4); // 2.4
 		
		// 取模：%
		// 结果的符号与被模数相同
		int m1=12;
		int n1=5;
		System.out.println(m1%n1); // 2
		
		int m2=-12;
		int n2=5;
		System.out.println(m2%n2); // -2
		
		int m3=12;
		int n3=-5;
		System.out.println(m3%n3); // 2
	
		int m4=-12;
		int n4=-5;
		System.out.println(m4%n4); // -2
		
		//前++
		//后++
		int j1=10;
		//j1++;
		++j1;
		System.out.println(j1);
		
		int a1=10;
		int b1=a1++;
		System.out.println("a1:"+a1);
		System.out.println("b1:"+b1);
		

		int a2=10;
		int b2=++a2;
		System.out.println("a2:"+a2);
		System.out.println("b2:"+b2);
		
		//特别的使用：++或--不会改变变量本身的数据类型
		short s1=10;
//		s1=s1+1; //编译不通过
//		s1=(short)(s1+1); //编译通过
		s1++;
		
	}

}
