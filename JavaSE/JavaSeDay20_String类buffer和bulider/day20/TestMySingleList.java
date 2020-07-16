package day20;

public class TestMySingleList {
	public static void main(String[] args) {
		MySingleList my = new MySingleList();
		
		my.add("张三");
		my.add("李四");
		my.add("王五");
		
		System.out.println(my.size());
		
		Object[] array = my.toArray();
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		System.out.println();
		
		my.remove("张三");
		array = my.toArray();
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		System.out.println();
		
		my.remove("王五");
		array = my.toArray();
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
	}
}
