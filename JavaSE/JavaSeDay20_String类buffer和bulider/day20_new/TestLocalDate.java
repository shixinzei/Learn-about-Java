package day20;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestLocalDate {
    @Test
    public void test7(){
        LocalDate t = LocalDate.now();
        System.out.println(t.isLeapYear());
    }

    @Test
    public void test6(){
        LocalDate t = LocalDate.now();
        LocalDate days = t.minusDays(30);
        System.out.println(days);
    }

    @Test
    public void test5(){
        LocalDate t = LocalDate.now();
        LocalDate days = t.plusDays(130);
        System.out.println(days);
    }

    @Test
    public void test4(){
        LocalDate birth = LocalDate.of(1999,9,9);
        LocalDate date = birth.withYear(2000);
        System.out.println(birth);
        System.out.println(date);
    }

    @Test
    public void test3(){
        LocalDate birth = LocalDate.of(1999,9,9);
        int year = birth.getYear();

        LocalDate today = LocalDate.now();
        int t = today.getYear();
        System.out.println(t-year);
    }

    @Test
    public void test2(){
        LocalDate birth = LocalDate.of(1999,9,9);
        System.out.println(birth);
    }

    @Test
    public void test1(){
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
    }
}
