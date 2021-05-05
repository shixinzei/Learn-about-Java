package day20;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestMath2 {



    @Test
    public void test3(){
        BigDecimal big1 = new BigDecimal("123.4567890123465789021234567890");
        BigDecimal big2 = new BigDecimal("1.23456789");
        // 除不尽报异常
        // System.out.println("商:" + big1.divide(big2));
        // 舍入模式
        System.out.println("商:" + big1.divide(big2,BigDecimal.ROUND_CEILING));
        System.out.println("商:" + big1.divide(big2,BigDecimal.ROUND_FLOOR));
        System.out.println("商:" + big1.divide(big2,6, BigDecimal.ROUND_CEILING));
    }

    @Test
    public void test2(){
        BigDecimal big1 = new BigDecimal("122.31221312312323312313121");
        BigDecimal big2 = new BigDecimal("1223122131231.2323312313121");
        System.out.println("和:" + big1.add(big2));
        System.out.println("差:" + big1.subtract(big2));
        System.out.println("积:" + big1.multiply(big2));
        System.out.println("商:" + big1.divide(big2));
        System.out.println("幂:" + big1.pow(3));
    }

    @Test
    public void test(){
        BigInteger big1 = new BigInteger("12231221312312323312313121");
        BigInteger big2 = new BigInteger("12231221312312323312313121");
        System.out.println("和:" + big1.add(big2));
        System.out.println("差:" + big1.subtract(big2));
        System.out.println("积:" + big1.multiply(big2));
        System.out.println("商:" + big1.divide(big2));
        System.out.println("幂:" + big1.pow(3));
    }
}
