package day20;

public class TestMySingleList {
	public static void main(String[] args) {
		MySingleList my = new MySingleList();
		
		my.add("����");
		my.add("����");
		my.add("����");
		
		System.out.println(my.size());
		
		Object[] array = my.toArray();
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		System.out.println();
		
		my.remove("����");
		array = my.toArray();
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		System.out.println();
		
		my.remove("����");
		array = my.toArray();
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
	}
}
