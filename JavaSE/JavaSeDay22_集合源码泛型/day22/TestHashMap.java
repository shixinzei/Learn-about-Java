package day22;

import java.util.HashMap;

import org.junit.Test;

public class TestHashMap {
	@SuppressWarnings("all")
	@Test
	public void test1() {
		HashMap map = new HashMap();
		for(int i=0;i<=20;i++) {
			map.put(new MyData(i), "xx"+i);
		}
	}
}

class MyData{
	private int num;

	public MyData(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "MyData [num=" + num + "]";
	}

	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + num;
//		return result;
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyData other = (MyData) obj;
		if (num != other.num)
			return false;
		return true;
	}
}