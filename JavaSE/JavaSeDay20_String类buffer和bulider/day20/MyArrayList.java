package day20;

import java.util.Arrays;

public class MyArrayList {
	private Object[] data;
	private int total=0;
	
	public MyArrayList() {
		data = new Object[10];	
	}
	
	public void add(Object obj) {
		if(total >= data.length) {
			data = Arrays.copyOf(data, data.length*2);
		}
		data[total++] = obj;
	}
	
	public int size() {
		return total;
	}
	
	public Object[] getAll() {
		return Arrays.copyOf(data, total);
	}
	
	public Object get(int index) {
		if(index<0||index>=total) {
			throw new IndexOutOfBoundsException(index + "²»ºÏ·¨");
		}
		return data[index];
	}
	
	public int indexOf(Object obj) {
		int index = -1;
		if(obj == null) {
			for(int i=0;i<total;i++) {
				if(obj == data[i]){
					index = i;
					break;
				}
			}			
		}else {
			for(int i=0;i<total;i++) {
				if(obj.equals(data[i])){
					index = i;
					break;
				}
			}			
		}
		return index;
	}
	
	public void remove(Object obj) {		
		int index = indexOf(obj);
		if(index!=-1) {
			System.arraycopy(data, index+1, data, index, total-index-1);
			data[--total] = null;
		}
	}
	
	public void set(Object old, Object dest) {
		int index = indexOf(old);
		if(index != -1) {
			data[index] = dest;
		}
	}
	
}
