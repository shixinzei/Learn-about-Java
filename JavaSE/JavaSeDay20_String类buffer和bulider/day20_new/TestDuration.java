package day20;

import org.junit.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class TestDuration {

    @Test
    public void test3(){
        LocalTime now = LocalTime.now();
        LocalTime xia = LocalTime.of(17,0,0);
        Duration d = Duration.between(now, xia);
        System.out.println(d);
    }

    @Test
    public void test2(){
        LocalDate today = LocalDate.now();
        LocalDate birth = LocalDate.of(2019,2,5);
        Period p = Period.between(today,birth);
        System.out.println(p);
    }

    @Test
    public void test(){
        LocalDate today = LocalDate.now();
        LocalDate birth = LocalDate.of(1996,6,6);
        Period p = Period.between(today,birth);
        System.out.println(p);
    }
}
