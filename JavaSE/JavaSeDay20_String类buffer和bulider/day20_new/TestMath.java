package day20;

import org.junit.Test;

public class TestMath {


    @Test
    public void test(){
        System.out.println(Math.round(2.4));
        System.out.println(Math.ceil(2.4));
        System.out.println(Math.floor(2.4));
        System.out.println();
        System.out.println(Math.round(2.6));
        System.out.println(Math.ceil(2.6));
        System.out.println(Math.floor(2.6));
        System.out.println();
        System.out.println(Math.round(-2.4));
        System.out.println(Math.ceil(-2.4));
        System.out.println(Math.floor(-2.4));
        System.out.println();

        System.out.println(Math.round(2.5));
        System.out.println(Math.round(-2.5));

    }
}
