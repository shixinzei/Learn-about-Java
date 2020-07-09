package day15;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student("张三", 89);
		Student s2 = new Student("张三", 89);
		System.out.println(s1.compareTo(s2));
		if(s1.compareTo(s2)==0) {
			System.out.println("s1 等于 s2");
		}else if(s1.compareTo(s2)>0) {
			System.out.println("s1 大于 s2");
		}else {
			System.out.println("s1 小于 s2");
		}
	}
}
