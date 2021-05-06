package day21.set.exer;

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

                /*if(b1.getPrice()>b2.getPrice()){
                    return 1;
                }else if(b1.getPrice()<b2.getPrice()){
                    return -1;
                }else{
                    return 0;
                }*/

                /*
                return Double.compare(b1.getPrice(),b2.getPrice());*/

                long p1 = Double.doubleToLongBits(b1.getPrice());
                long p2 = Double.doubleToLongBits(b2.getPrice());
                return Long.compare(p1,p2);
            }
        });
        set.add(new Book(1,"xxx","t",99,1000));
        set.add(new Book(2,"xx","tt",9,2000));
        set.add(new Book(3,"xxxx","ttt",999,10000));
        set.add(new Book(3,"xxxx","ttt",999,10000));

        for (Object o:set) {
            System.out.println(o);
        }
    }
}
