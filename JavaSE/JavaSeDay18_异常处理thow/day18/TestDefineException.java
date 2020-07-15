package day18;

import java.util.Scanner;

import org.junit.Test;

public class TestDefineException {
	@Test
	public void test2() {
		System.err.println("hello");
		System.out.println("hello");
	}
	
	@Test
	public void test() {
		try {
			login();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void login() throws Exception{
		Scanner in = new Scanner(System.in);
		System.out.println("�������û�����");
		String username = in.nextLine();
		
		System.out.println("���������룺");
		String password = in.nextLine();
		
		String code = "1234";
		System.out.println("������У���룺(" + code + ")");
		String check = in.nextLine();
		
		if(!code.equals(check)) {
			throw new Exception("У�����������");
		}
		
		if(!("admin".equals(username)&&"123".equals(password))) {
			throw new UsernameOrPasswordError("�û������������");
		}
	}
}

class UsernameOrPasswordError extends Exception{

	public UsernameOrPasswordError() {
		super();
		
	}

	public UsernameOrPasswordError(String message) {
		super(message);
		
	}
	
	
}
