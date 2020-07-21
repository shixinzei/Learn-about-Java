package day22_exer1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {
	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("张三");
		list1.add("李四");
		list1.add("王五");
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("赵六");
		
 		map.put("aa", list1);
 		map.put("bb", list2);
 		
 		Set<Entry<String, ArrayList<String>>> entrySet = map.entrySet();
 		for (Entry<String, ArrayList<String>> entry : entrySet) {
			String key = entry.getKey();
			System.out.println(key);
			ArrayList<String> value = entry.getValue();
			for (String string : value) {
				System.out.println("\t" + string);
			}
		}
 		
	}
}
