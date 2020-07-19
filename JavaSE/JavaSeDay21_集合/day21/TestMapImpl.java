package day21;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;

public class TestMapImpl {
	@SuppressWarnings("all")
	
	@Test
	public void test2() {
		Properties properties = System.getProperties();
		Set entrySet = properties.entrySet();
		for(Object property : entrySet) {
			System.out.println(property);
		}
	}
	
	@Test
	public void test1() {
		Map map = new LinkedHashMap();
		map.put("aa", "AA");
		map.put("cc", "CC");
		map.put("bb", null);
		map.put("dd", new String[] {"aa","bb"});
		
		Set entrySet = map.entrySet();
		for(Object value : entrySet) { 
			System.out.println(value);
		}
	}
}
