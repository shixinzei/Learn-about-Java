package day20;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.Test;

public class TestLocalDate {
	@Test
	public void test3() {
		LocalDate birth = LocalDate.of(1999, 9, 9);
		System.out.println(birth);
		
		int year = birth.getYear();
		LocalDate today = LocalDate.now();
		int t = today.getYear();
		System.out.println(t-year);
	}
	
	@Test
	public void test2() {
		LocalDate birth = LocalDate.of(1999, 9, 9);
		System.out.println(birth);
	}
	
	@Test
	public void test() {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
	}
}
