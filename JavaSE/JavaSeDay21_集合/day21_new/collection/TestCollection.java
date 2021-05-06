package day21.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestCollection {


    @SuppressWarnings("all")
    @Test
    public void test2(){
        // 多态引用
        Collection c = new ArrayList();
        c.add("张三");
        c.add("李四");
        c.add("王五");
        c.add("赵六");
        c.add("钱七");

        Collection other = new ArrayList();
        other.add("王五");
        other.add("赵六");

        //c.remove("张三");
        c.removeAll(other);

        Object[] array = c.toArray();
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    @SuppressWarnings("all")
    @Test
    public void test1(){
        // 多态引用
        Collection c = new ArrayList();
        c.add("张三");
        c.add("李四");

        Collection other = new ArrayList();
        other.add("王五");
        other.add("赵六");

        c.addAll(other);
        //c.add(other);
        System.out.println(c.size());

        Object[] array = c.toArray();
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
