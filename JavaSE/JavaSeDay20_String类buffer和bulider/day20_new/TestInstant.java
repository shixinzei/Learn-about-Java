package day20;

import org.junit.Test;

import java.time.*;

public class TestInstant {
    @Test
    public void test(){
        Instant i = Instant.now();
        System.out.println(i);

        LocalDateTime z = LocalDateTime.now();
        System.out.println(z);

        OffsetDateTime atOffset = i.atOffset(ZoneOffset.ofHours(8));
        System.out.println(atOffset);

        OffsetDateTime atOffset2 = i.atOffset(ZoneOffset.ofHours(-8));
        System.out.println(atOffset2);
    }
}
