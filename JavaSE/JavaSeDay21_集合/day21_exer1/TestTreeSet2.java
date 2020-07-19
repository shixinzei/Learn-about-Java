package day21_exer1;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSet2 {
	@SuppressWarnings("all")
	
	public static void main(String[] args) {
		TreeSet set = new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Book b1 = (Book) o1;
				Book b2 = (Book) o2;
				if(b1.getPrice()>b2.getPrice()) {
					return 1;
				}else if(b1.getPrice()<b2.getPrice()) {
					return -1;
				}else {
					return 0;
				}
			}
		});
		set.add(new Book(1, "从入门到精通", "wydxry", 99, 10000));
		set.add(new Book(2, "从入门到放弃", "zl", 6.6, 20000));
		set.add(new Book(3, "从精通到疯癫", "yyyy", 29, 13000));
		set.add(new Book(3, "从精通到疯癫2", "yyyy", 39, 13000));
		for(Object obj : set) {
			System.out.println(obj);
		}
	}
}
