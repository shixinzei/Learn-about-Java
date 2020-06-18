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
		
		//练习：交换两个变量的值
		int m=10;
		int n=5;
		System.out.println("m="+m+",n="+n);
		
		//方式一：
		int t=m;
		m=n;
		n=t;
		System.out.println("m="+m+",n="+n);
		
		//方式二：
		//好处：没有定义中间变量
		//坏处：可能会溢出；适用性差
		m=m+n; 
		n=m-n;
		m=m-n;
		System.out.println("m="+m+",n="+n);
	
		//方式三：使用为运算符：(m^n)^n=m;
		//好处：没有定义中间变量
		//坏处：适用性差；难
		m=m^n;
		n=m^n;
		m=m^n;
		System.out.println("m="+m+",n="+n);
		
	}

}
