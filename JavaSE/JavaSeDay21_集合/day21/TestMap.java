package day21;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class TestMap {
	@SuppressWarnings("all")
	
	@Test
	public void test5() {
		Map map = new HashMap();
		map.put("aa", "AA");
		map.put("cc", "CC");
		map.put("bb", null);
		map.put("dd", new String[] {"aa","bb"});
		
		Set entrySet = map.entrySet();
		for(Object value : entrySet) {
//			Map.Entry<K, V>
			System.out.println(value);
		}
	}
	
	@Test
	public void test4() {
		Map map = new HashMap();
		map.put("aa", "AA");
		map.put("cc", "CC");
		map.put("bb", null);
		map.put("dd", new String[] {"aa","bb"});
		
		Collection values = map.values();
		for(Object value : values) {
			System.out.println(value);
		}
	}
	
	@Test
	public void test3() {
		Map map = new HashMap();
		map.put("aa", "AA");
		map.put("cc", "CC");
		map.put("bb", null);
		map.put("dd", new String[] {"aa","bb"});
		
		Set keySet = map.keySet();
		for(Object key : keySet) {
			System.out.println(key);
		}
	}
	
	@Test
	public void test2() {
		Map map = new HashMap();
		map.put("aa", "AA");
		map.put("aa", "BB");
		System.out.println(map.size());
		map.remove("aa");
		System.out.println(map.size());
	}
	
	@Test
	public void test1() {
		Map map = new HashMap();
		map.put("aa", "AA");
		map.put("cc", "CC");
		map.put("bb", null);
		map.put("dd", new String[] {"aa","bb"});
		System.out.println(map.size());
		map.remove("aa");
		System.out.println(map.size());
	}
}
