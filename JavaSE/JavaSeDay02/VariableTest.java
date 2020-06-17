
public class VariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1=12;
		byte b2=127;
		// 编译不通过
		//byte b3=128;
		
		int num1=10;
		
		long n1=123L;
		System.out.println(n1);
		
		float f1=32.1f;
		double d1=12.3;
		System.out.println(f1);
		System.out.println(d1);
		
		char a='1';
		// 编译不通过
		//char b='ab';
		a='字';
		System.out.println(a);
		
		char b='\n';
		System.out.println(b);
		
	}

}
