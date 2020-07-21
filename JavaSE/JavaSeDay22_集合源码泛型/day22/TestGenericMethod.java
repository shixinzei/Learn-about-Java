package day22;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestGenericMethod {
	@Test
	public void test1() {
		List<String> asList = Arrays.asList("hello", "java");
		System.out.println(asList.getClass());
		List<Integer> asList2 = Arrays.asList(1, 2, 3, 4);
		
	}
}	
