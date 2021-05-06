package day21.set.exer;

import java.util.LinkedHashSet;

public class TestSetExer1 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add(new Book(1,"xxx","t",99,1000));
        set.add(new Book(2,"xx","tt",9,2000));
        set.add(new Book(3,"xxxx","ttt",999,10000));
        set.add(new Book(3,"xxxx","ttt",999,10000));

        for (Object o:set) {
            System.out.println(o);
        }
    }
}
