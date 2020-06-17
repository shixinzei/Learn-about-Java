package  ‰»Î ‰≥ˆ;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		byte[] buf=new byte[10];
		for(int i=0;i<buf.length;i++) {
			buf[i]=(byte)i;
		}
		try {
			FileOutputStream out=new FileOutputStream("a.dat");
			out.write(buf);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
