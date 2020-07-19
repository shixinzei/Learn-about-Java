package day21_exer1;

import java.util.TreeSet;

public class TestTreeSet {
	@SuppressWarnings("all")
	
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(new Book(1, "从入门到精通", "wydxry", 99, 10000));
		set.add(new Book(2, "从入门到放弃", "zl", 6.6, 20000));
		set.add(new Book(3, "从精通到疯癫", "yyyy", 29, 13000));
		set.add(new Book(3, "从精通到疯癫2", "yyyy", 39, 13000));
		for(Object obj : set) {
			System.out.println(obj);
		}
	}
}
