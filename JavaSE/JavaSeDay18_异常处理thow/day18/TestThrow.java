package day18;


import org.junit.Test;

public class TestThrow {
	@Test
	public void test1() {
		try {
			throw new RuntimeException("����ʱ�쳣");
		} catch (Exception e) {
			
			e.printStackTrace();
		}		
		System.out.println("��������");
	}
}
