package day03;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class VariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short s1=10;
		int i1=20;
		// 自动类型转换
		int i2=s1+i1;
		System.out.println(i2);
		
		long l1=123L;
		float f1=123.F;
//		long l1=f1+l1; //编译不通过
		float f2=l1+f1;
		System.out.println(f2);
		
		char c1='a'; //ascii码值为97
		int i3=c1+i1;
		System.out.println(i3);
		
		byte b1=12;
		short s2=20;
//		short s3=b1+s2; //编译不通过 int类型
//		char c2=b1+c1; //编译不通过 int类型
//		short s4=s2+c1; //编译不通过 int类型
		
		byte b2=10;
//		byte b3=b1+b2; //编译不通过 int类型
		
		//整型常量默认为int类型
		short s5=10;
		int i4=s5+2;
		
		//浮点型常量默认为double类型
//		float f3=s5+2.1; //编译不通过 double类型
		double d1=s5+2.1;
		
		long l2=1234L;
		System.out.println(l2);
		
		long l3=1234; //自动类型提升
		System.out.println(l3);
		
		float f3=123.4F;
//		float f4=123.4; //编译不通过 double类型
		
		long l4=23456456456L;
		System.out.println(l4);
		
	}

}
