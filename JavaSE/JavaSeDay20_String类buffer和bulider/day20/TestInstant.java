package day20;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import org.junit.Test;

public class TestInstant {
	@Test
	public void test() {
		Instant i = Instant.now();
		System.out.println(i);
		
		LocalDateTime z = LocalDateTime.now();
		System.out.println(z);
		
		OffsetDateTime atOffset = i.atOffset(ZoneOffset.ofHours(8));
		System.out.println(atOffset);
	}
}
