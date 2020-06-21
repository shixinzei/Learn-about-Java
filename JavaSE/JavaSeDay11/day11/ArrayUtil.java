package day11;

public class ArrayUtil {
	public int getMax(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public int getMin(int[] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}
	
	public int getSum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	public int getAvg(int[] arr) {
		return getSum(arr)/arr.length;
	}
	
	public int[] copy(int[] arr) {
		int[] newarr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			newarr[i]=arr[i];
		}
		return newarr;
	}
	
	public void reverse(int[] arr) {
		for(int i=0;i<arr.length/2;i++) {
			arr[i]=arr[arr.length-1-i];
		}
	}
	
	public void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j+1]<arr[j]) {
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
	}
	
	public int getIndex(int[] arr,int value) {
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==value) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	public void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
