package ��������;

import java.util.ArrayList;

class Value
{
	private int i;
	public void set(int i)
	{
		this.i=i;
	}
	public int get()
	{
		return i;
	}
	public String toString()
	{
		return ""+i;
	}
}

public class NoteBook {
	// ��������
	private ArrayList<String> notes=new ArrayList<String>();
	private int size=0;
 	
	public void add(String s)
	{
		notes.add(s);
	}
	
	public void add(String s,int location)
	{
		notes.add(location,s);
	}
	
	public int getSize()
	{
		return notes.size();
	}
	
	public String getNode(int index)
	{
		return notes.get(index);
	}
	
	public void removeNote(int index)
	{
		notes.remove(index);
	}
	
	public String[] list()
	{
		String[] a=new String[notes.size()];
//		for(int i=0;i<notes.size();i++)
//		{
//			a[i]=notes.get(i);
//		}
		notes.toArray(a);
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���±�
//		String[] a= new String[2];
//		a[0]="first";
//		a[1]="second";
//		NoteBook nb=new NoteBook();
//		nb.add("first");
//		nb.add("second");
//		nb.add("third",1);
//		System.out.println(nb.getSize());
//		System.out.println(nb.getNode(0));
//		System.out.println(nb.getNode(1));
//		System.out.println(nb.getNode(2));
//		nb.removeNote(1);
//		String[] a=nb.list();
//		System.out.println("----------");
//		for(String s:a)
//		{
//			System.out.println(s);
//		}
		Value[] a=new Value[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=new Value();
			a[i].set(i);
		}
		for(Value v:a)
		{
			System.out.println(v.get());
			v.set(0);
		}
		for(Value v:a)
		{
			System.out.println(v.get());
		}
	}

}
