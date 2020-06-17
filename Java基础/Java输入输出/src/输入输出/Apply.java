package  ‰»Î ‰≥ˆ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

class Student implements  Serializable{
	private String name;
	private int age;
	private int grade;
	
	public Student(String name,int age,int grade) {
		this.age=age;
		this.grade=grade;
		this.name=name;
	}
	
	public String toString()
	{
		return name+" "+age+" "+grade;
	}
	
}


public class Apply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("John",18,5);
		System.out.println(s1);
		try {
			ObjectOutputStream out=new ObjectOutputStream(
					new FileOutputStream("obj.dat"));
			out.writeObject(s1);
			out.close();
			
			ObjectInputStream in=new ObjectInputStream(
					new FileInputStream("obj.dat"));
			Student s2=(Student)in.readObject();
			System.out.println(s2);
			in.close();
			System.out.println(s1==s2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
