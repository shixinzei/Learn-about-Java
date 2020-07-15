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
		System.out.println("请输入用户名：");
		String username = in.nextLine();
		
		System.out.println("请输入密码：");
		String password = in.nextLine();
		
		String code = "1234";
		System.out.println("请输入校验码：(" + code + ")");
		String check = in.nextLine();
		
		if(!code.equals(check)) {
			throw new Exception("校验码输入错误");
		}
		
		if(!("admin".equals(username)&&"123".equals(password))) {
			throw new UsernameOrPasswordError("用户名或密码错误");
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
