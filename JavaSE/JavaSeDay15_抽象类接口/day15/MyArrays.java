package day15;

public class MyArrays {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("张三", 89);
		students[1] = new Student("李四", 56);
		students[2] = new Student("王五", 78);
		sort(students);
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
		}
	
	}
	public static void sort(Object[] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				Comparable pre = (Comparable) arr[j];
				if(pre.compareTo(arr[j+1]) > 0){
					Object tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	public void sort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j+1]<arr[j]) {
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
}	
