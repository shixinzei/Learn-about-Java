package day21.map;

import org.junit.Test;

import java.util.*;

public class TestMapImp1 {
    @SuppressWarnings("all")
    @Test
    public void test2(){
        // 获取系统属性
        Properties properties = System.getProperties();
        Set entrySet = properties.entrySet();
        for (Object propert:entrySet){
            System.out.println(propert);
        }
    }

    @SuppressWarnings("all")
    @Test
    public void test(){
        Map map = new LinkedHashMap();
        map.put("xx","yy");
        map.put("xxx",null);
        map.put("x","y");
        map.put("x",new String[]{"y","z"});

        Set entryset = map.entrySet();
        for(Object entry:entryset){
            System.out.println(entry);
        }
    }
}
