package day14;

public class TestStatic {
	private int i;//�Ǿ�̬��
	public static void main(String[] args) {
		Chinese c1 = new Chinese();
		Chinese c2 = new Chinese();
		
		c1.name = "����";
		c2.name = "����";
		
		c1.country = "�й�";
		c2.country = "�л����񹲺͹�";
		
		System.out.println("c1.country = " + c1.country);
		System.out.println("c2.country = " + c2.country);
		
		System.out.println("c1.name = " + c1.name);
		System.out.println("c2.name = " + c2.name);
		
		
	}
	public void test() {
		System.out.println("�Ǿ�̬�ķ���");
	}
}

class Chinese{
	static String country; 
	String name;
	
	{
		System.out.println("�Ǿ�̬�����");
	}
	static {
		System.out.println("��̬�����1");
	}
	static {
		System.out.println("��̬�����2");
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