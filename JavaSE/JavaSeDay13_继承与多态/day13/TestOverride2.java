package day13;

public class TestOverride2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}

}
//Object是一个根父类，所有类的父类
class A{
	public Object test() {
		return null;
	}
	
}
class B extends A{
	//重写时，返回值类型可以和父类一样
//	public Object test() {
//		return null;
//	}
	//重写时，返回值类型可以和父类不一样，String<Object
	public String test() {
		return "";
	}
	
}

class C {
	// A是引用数据类型
	public A test() {
		return null;
	}
	
}

class D extends C{
//	public A test() {
//		return null;
//	}
	
	public B test() {
		return null;
	}
}

