package day20;

import org.junit.Test;

public class TestStringBuffer {



    @Test
    public void test6(){
        StringBuffer s = new StringBuffer();
        for(int i=0;i<5;i++){
            s.append("1234567890");
        }
        System.out.println(s);
    }

    @Test
    public void test5(){
        StringBuffer s = new StringBuffer("hello");
        s.reverse();
        System.out.println(s);
    }

    @Test
    public void test4(){
        StringBuffer s = new StringBuffer("hello");
        s.delete(2, 5);
        System.out.println(s);
    }

    @Test
    public void test3(){
        StringBuffer s = new StringBuffer("hello");
        s.insert(2,"world");
        System.out.println(s);
    }

    @Test
    public void test2(){
        StringBuffer s = new StringBuffer();
        s.append(1).append(2).append(3);
        System.out.println(s);
    }

    @Test
    public void test(){
        String str = "hello";
        StringBuffer s = new StringBuffer("hello");
        change(str,s);
        System.out.println(str);
        System.out.println(s);
    }
    public void change(String str,StringBuffer sb){
        str += "world";
        sb.append("world");

    }
}
