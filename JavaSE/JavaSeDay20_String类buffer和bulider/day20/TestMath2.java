package day20;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

public class TestMath2 {
	@Test
	public void test2() {
		BigDecimal big1 = new BigDecimal("1234567823.13123");
		BigDecimal big2 = new BigDecimal("12345678231.3123");
		System.out.println(big1.add(big2));
		System.out.println(big1.subtract(big2));
		System.out.println(big1.divide(big2));
		System.out.println(big1.multiply(big2));
		System.out.println(big1.pow(3));
		
	}
	
	@Test
	public void test() {
		BigInteger big1 = new BigInteger("123456782313123");
		BigInteger big2 = new BigInteger("123456782313123");
		System.out.println(big1.add(big2));
		System.out.println(big1.subtract(big2));
		System.out.println(big1.divide(big2));
		System.out.println(big1.multiply(big2));
		System.out.println(big1.pow(3));
		
	}
}
