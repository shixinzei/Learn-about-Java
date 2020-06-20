package day09;

public class BinarySortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {2,3,4,5,7,8,9,10};
		int value=7;
		int l=0;
		int r=arr.length-1;
		boolean isFlag=true;
		while(l<=r) {
			int mid=(l+r)/2;
			if(arr[mid]==value) {
				System.out.println(mid);
				isFlag=false;
				break;
			}else if(arr[mid]>value) {
				r=mid-1;
			}else {
				l=mid+1;
			}
		}
		if(isFlag) {
			System.out.println("not found");
		}	
	}
}
