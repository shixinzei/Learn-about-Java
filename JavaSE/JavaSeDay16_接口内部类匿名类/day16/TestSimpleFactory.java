package day16;

public class TestSimpleFactory {
	public static void main(String[] args) {
		//û�й���
		BMW b = new BMW();
		
		//�й������
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
		System.out.println("����");
	}
	
}

class Benz implements Car{

	@Override
	public void run() {
		System.out.println("����");
	}
	
}

class Audi implements Car{

	@Override
	public void run() {
		System.out.println("�µ�");
	}
	
}

class DaZhong implements Car{

	@Override
	public void run() {
		System.out.println("����");
	}
	
}

//������
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
