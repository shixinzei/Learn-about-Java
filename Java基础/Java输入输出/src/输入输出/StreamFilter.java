package  ‰»Î ‰≥ˆ;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		byte[] buf=new byte[10];
		for(int i=0;i<buf.length;i++) {
			buf[i]=(byte)i;
		}
		try {
			DataOutputStream out=new DataOutputStream(
					new BufferedOutputStream(
							new FileOutputStream("a.dat")));
			int i=0xcafebabe;
//			int i=123456;
			out.writeInt(i);
			out.close();
			DataInputStream in=new DataInputStream(
					new BufferedInputStream(
							new FileInputStream("a.dat")));
			int j=in.readInt();
			System.out.println(j);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
