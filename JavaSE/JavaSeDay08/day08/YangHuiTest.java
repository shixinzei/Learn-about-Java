package day08;

public class YangHuiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[10][];
		for(int i=0;i<10;i++) {
			arr[i]=new int[i+1];
		}
		for(int i=0;i<10;i++) {
			arr[i][0]=1;
			arr[i][i]=1;
		}
		for(int i=1;i<10;i++) {
			for(int j=1;j<i;j++) {
				arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
			}
		}
		for(int i=0;i<10;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
