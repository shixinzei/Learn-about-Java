package day16;

public class TestSimpleFactory {
	public static void main(String[] args) {
		//没有工厂
		BMW b = new BMW();
		
		//有工厂情况
		Car car = SimpleFactory.getCar("bmw");
		car.run();
		Car car2 = SimpleFactory.getCar("audi");
		car2.run();
		
	}
}

interface Car{
	void run();
}

class BMW implements Car{

	@Override
	public void run() {
		System.out.println("宝马");
	}
	
}

class Benz implements Car{

	@Override
	public void run() {
		System.out.println("奔驰");
	}
	
}

class Audi implements Car{

	@Override
	public void run() {
		System.out.println("奥迪");
	}
	
}

class DaZhong implements Car{

	@Override
	public void run() {
		System.out.println("大众");
	}
	
}

//工厂类
class SimpleFactory{
	public static Car getCar(String type) {
		if("bmw".equals(type)) {
			return new BMW();
		}else if("benz".equals(type)) {
			return new Benz();
		}else {
			return new Audi();
		}
	}
}
