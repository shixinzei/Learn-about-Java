package day20;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {
    @Test
    public void test4() throws ParseException {
        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒 SSS毫秒 E");
        String str = sf.format(d);
        System.out.println(str);
    }

    @Test
    public void test3() throws ParseException {
        String str = "2019-01-04 14:45:34 345";
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date date = sf.parse(str);
        System.out.println(date);
    }

    @Test
    public void test2(){
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + day + "日");
    }

    @Test
    public void test(){
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
