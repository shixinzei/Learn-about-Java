package day09;

public class QuickSortTest {
	private static void quickSort(int[] data) {
		// TODO Auto-generated method stub
		subSort(data,0,data.length-1);
	}

	private static void subSort(int[] data, int start, int end) {
		// TODO Auto-generated method stub
		if(start<end) {
			int base=data[start];
			int low=start;
			int high=end+1;
			while(true) {
				while(low<end&&data[++low]<=base);
				while(high>start&&data[--high]>=base);
				if(low<high) {
					swap(data,low,high);
				}else {
					break;
				}
				
			}
			swap(data,start,high);
			subSort(data,start,high-1);
			subSort(data,high+1,end);
		}
	}

	private static void swap(int[] data, int low, int high) {
		// TODO Auto-generated method stub
		int temp=data[low];
		data[low]=data[high];
		data[high]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {9,-16,30,23,-30,-49,25,21,31};
		System.out.println("before sort:"+java.util.Arrays.toString(data));
		quickSort(data);
		System.out.println("after sort:"+java.util.Arrays.toString(data));
	}

}
