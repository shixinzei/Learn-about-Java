package day17;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * @author wydxry
 * @date 2020��7��15��
 */
public class TestJUnit {
	@BeforeClass
	public static void init() {
		System.out.println("��ʼ��...");
	}
	
	@Before
	public void start() {
		System.out.println("��ʼ����...");
	}
	
	
	@Test
	public void test1() {
		System.out.println("Hello Junit1");
	}
	
	@Test
	public void test2() {
		System.out.println("Hello Junit2");
	}
	
	public static void main(String[] args) {
		System.out.println("hehe");
	}
}
