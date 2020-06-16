package สýื้;

public class Arr4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a= {1,2,3,4,5};
//		int[] b= {1,2,3,4,5};
//		int[] c=a;
//		System.out.println(a==b);
//		System.out.println(a==c);
		int[] a= {1,2,3,4,5};
		int[] b=new int[a.length];
		for(int i=0;i<b.length;i++)
		{
			b[i]=a[i];
		}
//		for(int i=0;i<b.length;i++)
//		{
//			System.out.println(b[i]);
//		}
		boolean isEqu=true;
		for(int i=0;i<b.length;i++)
		{
			if(a[i]!=b[i])
			{
				isEqu=false;
				break;
			}
		}
		System.out.println(a==b);
		System.out.println(isEqu);
	}

}
