package day21.set.exer;

import java.util.HashSet;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new Book(1,"xxx","t",99,1000));
        set.add(new Book(2,"xx","tt",9,2000));
        set.add(new Book(3,"xxxx","ttt",999,10000));
        set.add(new Book(3,"xxxx","ttt",999,10000));

        for (Object o:set) {
            System.out.println(o);
        }
    }
}
