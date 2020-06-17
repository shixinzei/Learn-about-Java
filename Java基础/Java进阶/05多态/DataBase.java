package ∂‡Ã¨;

import java.util.ArrayList;

public class DataBase {
	private ArrayList<Item> listItem=new ArrayList<Item>();
	
	public void add(Item item)
	{
		listItem.add(item);
	}
	public void list()
	{
		for(Item item:listItem)
		{
			item.print();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item=new Item("a",0,true,"...");
		CD cd=new CD("a","a",0,0, "...");
		item=cd;
		DataBase db=new DataBase();
		db.add(new CD("abc", "abc", 4, 0, "..."));
		db.add(new CD("def", "abcd", 4,  0, "..."));
		db.add(new DVD("aaa", "12c", 4, "..."));
		db.add(new VideoGame("vvv",1,true,"...",4));
		db.list();
	}

}
