package day21.map;

import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {

    @SuppressWarnings("all")
    @Test
    public void test5(){
        Map map = new HashMap();
        map.put("xx","yy");
        map.put("xxx",null);
        map.put("x","y");
        map.put("x",new String[]{"y","z"});

        Set entryset = map.entrySet();
        for(Object entry:entryset){
            System.out.println(entry);
        }
    }

    @SuppressWarnings("all")
    @Test
    public void test4(){
        Map map = new HashMap();
        map.put("xx","yy");
        map.put("xxx",null);
        map.put("x","y");
        map.put("x",new String[]{"y","z"});

        Collection values = map.values();
        for(Object value:values){
            System.out.println(value);
        }
    }

    @SuppressWarnings("all")
    @Test
    public void test3(){
        Map map = new HashMap();
        map.put("xx","yy");
        map.put("xxx",null);
        map.put("x","y");
        map.put("x",new String[]{"y","z"});

        map.put("x","666");
        System.out.println("对数:" + map.size());

        Set keySet = map.keySet();
        for(Object key:keySet){
            System.out.println(key);
        }
    }

    @SuppressWarnings("all")
    @Test
    public void test2(){
        Map map = new HashMap();
        map.put("xx","yy");
        map.put("xxx",null);
        map.put("x","y");
        map.put("x",new String[]{"y","z"});

        map.remove("x");

        System.out.println("对数:" + map.size());
    }

    @SuppressWarnings("all")
    @Test
    public void test(){
        Map map = new HashMap();
        map.put("xx","yy");
        map.put("xxx",null);
        map.put("x","y");
        map.put("x",new String[]{"y","z"});

        System.out.println("对数" + map.size());
    }

}
