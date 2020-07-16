package day20;

import java.time.LocalDate;
import java.time.Period;

import org.junit.Test;

public class TestDuration {
	@Test
	public void test2() {
		LocalDate today = LocalDate.now();
		LocalDate birth = LocalDate.of(1998, 10, 27);
		Period p = Period.between(today, birth);
		System.out.println(p);
	}
	
	@Test
	public void test() {
		LocalDate today = LocalDate.now();
		LocalDate birth = LocalDate.of(1996, 6, 6);
		Period p = Period.between(today, birth);
		System.out.println(p);
	}
}
