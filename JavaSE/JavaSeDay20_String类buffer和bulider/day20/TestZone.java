package day20;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

import org.junit.Test;

public class TestZone {
	
	@Test
	public void test2() {
		ZonedDateTime z = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(z);
	}
	
	@Test
	public void test() {
		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		for(String string:availableZoneIds) {
			System.out.println(string);
		}
	}
}
