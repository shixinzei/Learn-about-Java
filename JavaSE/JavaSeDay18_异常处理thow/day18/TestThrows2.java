package day18;

public class TestThrows2 {
	public static void main(String[] args) {
		Father f = new Son();
		try {
			Object obj = f.test();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

class Father{
	public Object test() throws Exception{
		System.out.println("�����");
		return null;
	}
}

class Son extends Father{
	public String test() throws RuntimeException{
		System.out.println("�����");
		return "";
	}
}