package day13;

public class TestClassCast {
	public static void main(String[] args) {
		Person1 p = new Man1(); // 多态引用 向上转型
		Man1 m = new Man1(); // 本态引用

//		Man1 m2 = p;		
		Man1 m2 = (Man1)p; //向下转型
		
		Graphic g = new Circle2(2); // 多态引用 向上转型
		Circle2 c = new Circle2(2); // 本态引用
		
		DoorMan d = new DoorMan();
		Chinese chinese = new Chinese();
		d.welcome(chinese); // 
		American amrican = new American();
		d.welcome(amrican);
			
	}
}

class DoorMan{
	public void welcome(Human h) {
		h.say();
		if(h instanceof Chinese) {
			Chinese c = (Chinese) h;
			c.eat();
		}else if(h instanceof American) {
			American a = (American) h;
			a.meet();
		}
		
	}
	
}

class Human{
	public void say() {
		System.out.println("呵呵");
	}
}

class Chinese extends Human{
	public void say() {
		System.out.println("你好");
	}
	public void eat() {
		System.out.println("你吃了吗？");
	}
}

class American extends Human{
	public void say() {
		System.out.println("Hello");
	}
	public void meet() {
		// TODO Auto-generated method stub
		System.out.println("nice to meet you.");
	}
}

