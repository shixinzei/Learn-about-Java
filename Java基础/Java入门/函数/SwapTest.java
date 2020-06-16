package 函数;

public class SwapTest {
	public static void swap(int a,int b)
	{
		int t;
		t=a;
		a=b;
		b=t;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=6;
		// 传值调用 形式参数 实际参数
		swap(a,b);
		System.out.println("a="+a+";b="+b);
	}

}
