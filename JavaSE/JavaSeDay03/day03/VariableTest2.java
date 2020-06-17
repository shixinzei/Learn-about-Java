package day03;

public class VariableTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 强制类型转换 
		int i1=12;
//		byte b1=i1; // 编译不通过
		byte b1=(byte)i1;
		System.out.println(b1);
		
		float f1=12.3F;
		int i2=(int)f1;
		System.out.println(i2); //截断
		
		int i3=128;
		byte b2=(byte)i3;
		System.out.println(b2);
		
	}

}
