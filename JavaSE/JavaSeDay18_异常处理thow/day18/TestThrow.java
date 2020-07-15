package day18;


import org.junit.Test;

public class TestThrow {
	@Test
	public void test1() {
		try {
			throw new RuntimeException("运行时异常");
		} catch (Exception e) {
			
			e.printStackTrace();
		}		
		System.out.println("其他代码");
	}
}
