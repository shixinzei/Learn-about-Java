package day17;

public class TestEnum {
	public static void main(String[] args) {
//		Week m = Week.MONDAY;
//		System.out.println(m.name());
//		System.out.println(m.ordinal());
//		System.out.println(Week.SATURDAY.ordinal());
		
//		Week[] values = Week.values();
//		for(int i=0;i<values.length;i++) {
//			System.out.println(values[i]);
//		}
		
		Week s = Week.valueOf("SUNDAY");
		System.out.println(s);
		
	}
}
