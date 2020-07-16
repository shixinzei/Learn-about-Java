package day20;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.junit.Test;

public class TestDateFormat {
	@Test
	public void test() {
		LocalDate today = LocalDate.now();
		
		DateTimeFormatter d1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter d2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter d3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter d4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(d1.format(today));
		System.out.println(d2.format(today));
		System.out.println(d3.format(today));
		System.out.println(d4.format(today));
		
	}
}
