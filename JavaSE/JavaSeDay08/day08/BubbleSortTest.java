package day08;

public class BubbleSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {1,6,7,3,4,9,10};
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j+1]<arr[j]) {
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		
	}

}
