package day21_exer1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMapExer {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		ArrayList bj = new ArrayList();
		bj.add("北京市");
		
		ArrayList hn = new ArrayList();
		hn.add("海口市");
		hn.add("三亚市");
		
		ArrayList zj = new ArrayList();
		zj.add("绍兴市");
		zj.add("温州市");
		zj.add("嘉兴市");
		zj.add("台州市");
		
		map.put("北京市", bj);
		map.put("海南省", hn);
		map.put("浙江省", zj);
		
		Set entrySet = map.entrySet();
		
//		for(Object obj : entrySet) {
//			System.out.println(obj);
//		}
		
		for(Object object : entrySet) {
			Map.Entry entry = (Map.Entry) object;
			Object key = entry.getKey();
			System.out.println(key);
			ArrayList value = (ArrayList) entry.getValue();
			for(Object city : value) {
				System.out.println("\t" + city);
			}
		}
	}
}
