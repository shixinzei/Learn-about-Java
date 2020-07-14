package day16;

import java.util.Arrays;
import java.util.Comparator;

public class TestComparator {
	public static void main(String[] args) {
		Student[] arr = new Student[3];
		arr[0] = new Student(2,"王小二",89);
		arr[1] = new Student(3,"张三",87);
		arr[2] = new Student(1,"李四",56);
		
		Arrays.sort(arr, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Student s1 = (Student) o1;
				Student s2 = (Student) o2;
				return s1.getSocre()-s2.getSocre();
			}});
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
