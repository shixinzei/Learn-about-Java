package day21.list;

import org.junit.Test;

import java.util.LinkedList;

public class TestListImp1 {
    @SuppressWarnings("all")
    @Test
    public void test(){
        LinkedList list = new LinkedList();
        list.offerFirst("1");
        list.offerFirst("2");
        list.offerFirst("3");
        list.offerFirst("4");

        for(Object obj:list){
            System.out.println(obj);
        }
        System.out.println();

        System.out.println(list.pollFirst());
        System.out.println(list.pollFirst());
        System.out.println(list.pollFirst());
        System.out.println(list.pollFirst());
        System.out.println();

        list.offerLast("1");
        list.offerLast("2");
        list.offerLast("3");
        list.offerLast("4");

        for(Object obj:list){
            System.out.println(obj);
        }
    }
}
