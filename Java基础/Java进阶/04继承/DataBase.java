package ผฬณะ;

import java.util.ArrayList;

public class DataBase {
//	private ArrayList<CD> listCD=new ArrayList<CD>();
//	private ArrayList<DVD> listDVD=new ArrayList<DVD>();
	private ArrayList<Item> listItem=new ArrayList<Item>();
	
//	public void add(CD cd)
//	{
//		listCD.add(cd);
//	}
//	
//	public void add(DVD dvd)
//	{
//		listDVD.add(dvd);
//	}
	
	public void add(Item item)
	{
		listItem.add(item);
	}
	public void list()
	{
//		for(CD cd:listCD)
//		{
//			cd.print();
//		}
//		for(DVD dvd:listDVD)
//		{
//			dvd.print();
//		}
		for(Item item:listItem)
		{
			item.print();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBase db=new DataBase();
		db.add(new CD("abc", "abc", 4, "..."));
		db.add(new CD("def", "abcd", 4,  "..."));
		db.add(new DVD("aaa", "12c", 4, "..."));
		db.list();
	}

}
