package day21.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class TestForeach {

    @SuppressWarnings("all")
    @Test
    public void test4(){
        int[] arr = {1,2,3,4};
        for(int num:arr){
            num*=2;
        }

        for(int num:arr){
            System.out.println(num);
        }
    }

    @SuppressWarnings("all")
    @Test
    public void test3(){
        Collection c = new ArrayList();
        c.add("张三");
        c.add("李四");
        c.add("王五");
        c.add("赵六");
        c.add("钱七");
        for(Object obj:c){
            System.out.println(obj);
        }
    }

    @Test
    public void test2(){
        String[] names = {"张三","李四","王五"};
        for(String name:names){
            System.out.println(name);
        }
    }

    @Test
    public void test(){
        int[] arr = {1,2,3,4};
        for(int num:arr){
            System.out.println(num);
        }
    }
}
