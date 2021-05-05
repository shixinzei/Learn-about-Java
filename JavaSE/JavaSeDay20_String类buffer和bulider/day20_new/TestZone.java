package day20;

import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class TestZone {

    @Test
    public void test2(){
        ZonedDateTime z = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(z);
    }


    @Test
    public void test(){
        Set<String> avilableZoneIds = ZoneId.getAvailableZoneIds();
        for(String str:avilableZoneIds){
            System.out.println(str);
        }
    }
}
