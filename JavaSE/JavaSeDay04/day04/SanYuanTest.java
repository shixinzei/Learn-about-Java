package day04;

public class SanYuanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 获取两个数的最大值
		int m=10;
		int n=5;
		int max=(int) ((m>n)?m:(n+0.0));
		System.out.println(max);
		
		String maxStr=(m>n)?"m大":((m==n)?"相等":"n大");
		System.out.println(maxStr);
		
		if(m>n) {
			System.out.println("m");
		}else {
			System.out.println("n");
		}
		
		// 获取三个数中的最大值
		int n1=12,n2=43,n3=2;
		int max1=(n1>n2)?n1:n2;
		int maxx=(max1>n3)?max1:n3;
		System.out.println("最大值为："+maxx);
		// 可以嵌套
		int maxx1=(((n1>n2)?n1:n2)>n3?((n1>n2)?n1:n2):n3);
		System.out.println("最大值为："+maxx1);
		
	}

}
