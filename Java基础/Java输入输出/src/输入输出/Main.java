package 输入输出;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello word");
		System.out.println();
		Scanner in=new Scanner(System.in);
		byte[] buffer=new byte[1024];
		try {
			int len=System.in.read(buffer);
			String s=new String(buffer,0,len);
			System.out.println("读到了:"+len+"字节");
			System.out.println(s);
			System.out.println("s的长度是:"+s.length());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
