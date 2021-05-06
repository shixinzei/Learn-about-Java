package day21.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestList {
    @SuppressWarnings("all")
    @Test
    public void test3(){
        List list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("钱七");
        list.add("王八");

        // 从前往后
        ListIterator listIterator = list.listIterator();
        while(listIterator.hasNext()){
            Object next = listIterator.next();
            System.out.println(next);
        }
        System.out.println();


        // 从后往前
        listIterator = list.listIterator(list.size());
        while(listIterator.hasPrevious()){
            Object previous = listIterator.previous();
            System.out.println(previous);
        }
        System.out.println();

        // 从任意位置开始遍历
        listIterator = list.listIterator(3);
        while (listIterator.hasPrevious()){
            Object previous = listIterator.previous();
            System.out.println(previous);
        }

    }


    @SuppressWarnings("all")
    @Test
    public void test2(){
        List list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");

        int index = list.indexOf("王五");
        System.out.println(index);

        Object o = list.get(2);
        System.out.println(o);
    }

    @SuppressWarnings("all")
    @Test
    public void test(){
        List list = new ArrayList<>();
        list.add("张三");
        list.add(0,"李四");
        list.add("王五");
        list.add("赵六");
        list.remove(0);

        list.set(0,"zz");

        for(Object obj:list){
            System.out.println(obj);
        }
    }
}
