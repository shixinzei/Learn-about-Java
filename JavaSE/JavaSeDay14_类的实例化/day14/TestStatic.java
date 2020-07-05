package day14;

public class TestStatic {
	private int i;//非静态的
	public static void main(String[] args) {
		Chinese c1 = new Chinese();
		Chinese c2 = new Chinese();
		
		c1.name = "张三";
		c2.name = "李四";
		
		c1.country = "中国";
		c2.country = "中华人民共和国";
		
		System.out.println("c1.country = " + c1.country);
		System.out.println("c2.country = " + c2.country);
		
		System.out.println("c1.name = " + c1.name);
		System.out.println("c2.name = " + c2.name);
		
		
	}
	public void test() {
		System.out.println("非静态的方法");
	}
}

class Chinese{
	static String country; 
	String name;
	
	{
		System.out.println("非静态代码块");
	}
	static {
		System.out.println("静态代码块1");
	}
	static {
		System.out.println("静态代码块2");
	}
	public static String getCountry() {
		return country;
	}
	public static void setCountry(String country) {
		Chinese.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}