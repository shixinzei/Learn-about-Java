package day21;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

public class TestCollection {
	@Test
	public void test() {
		Collection c = new ArrayList();
		c.add("张三");
		c.add("李四");
		
		Collection other = new ArrayList();
		c.add("王五");
		c.add("赵六");
		
//		c.add(other);
		c.addAll(other);
		System.out.println(c.size());
		
		Object[] array = c.toArray();
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		
	}
}
