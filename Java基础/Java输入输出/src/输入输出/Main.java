package �������;

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
			System.out.println("������:"+len+"�ֽ�");
			System.out.println(s);
			System.out.println("s�ĳ�����:"+s.length());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
