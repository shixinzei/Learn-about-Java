package day22;

import java.util.HashMap;

import org.junit.Test;

public class TestHashMapSource {
	@SuppressWarnings("all")
	@Test
	public void test1() {
		HashMap map = new HashMap();
		map.put(0, "aa");
		map.put(1, "bb");
		map.put(2, "cc");
		map.put(3, "dd");
		map.put(4, "ee");
		map.put(5, "aa");
		map.put(6, "bb");
		map.put(7, "cc");
		map.put(8, "dd");
		map.put(9, "ee");
		map.put(10, "aa");
		map.put(11, "bb");
		map.put(12, "cc");
	}
}
