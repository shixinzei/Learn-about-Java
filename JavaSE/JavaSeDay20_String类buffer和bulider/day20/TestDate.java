package day20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class TestDate {
	
	@Test
	public void test3() throws ParseException {
		String str = "2020-07-16 11:03";
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date = sf.parse(str);
		System.out.println(date);
	}
	
	@Test
	public void test2() {
		Calendar c= Calendar.getInstance();
		System.out.println(c);
	
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("Äê£º" + year + ",ÔÂ£º" + month + ",ÈÕ£º" + day);
	}
	
	@Test
	public void test() {
		Date now = new Date();
		System.out.println(now);
		
		long time = now.getTime();
		System.out.println(time);
		
		Date date = new Date(time);
		System.out.println(date);
		
		Date future = new Date(Long.MAX_VALUE);
		System.out.println(future);
	}
}
