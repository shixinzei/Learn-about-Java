package day22_exer1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TestExer3 {
	public static void main(String[] args) {
		HashMap<String, String[]> map = new HashMap<>();
		
		map.put("张三", new String[] {"aa","AA"});
		map.put("李四", null);
		map.put("王五", new String[] {"BB"});
		
		Set<Entry<String, String[]>> entrySet = map.entrySet();
		for (Entry<String, String[]> entry : entrySet) {
//			System.out.println(entry);
			
			System.out.println(entry.getKey());
			String[] value = entry.getValue();
			if(value != null) {
				for (String string : value) {
					System.out.println("\t" + string);
				}
			}
		}
 	}
}
