package day16;

public class TestFactoryMethod {
	public static void main(String[] args) {
		Car c = BMWFactory.getBMW();
		c.run();
		
		BaoMaFactory bm = new BaoMaFactory();
		Car c2 = bm.getCar();
		c2.run();
		
		
	}
}

class BMWFactory{
	public static BMW getBMW() {
		return new BMW();
	}
}

class BenzFactory{
	public static Benz getBenz() {
		return new Benz();
	}
}

interface CarFactory{
	Car getCar();
}

class BaoMaFactory implements CarFactory{

	@Override
	public Car getCar() {
		return new BMW();
	}
	
}


class BenChiFactory implements CarFactory{

	@Override
	public Car getCar() {
		return new Benz();
	}
	
}

class QQ implements Car{

	@Override
	public void run() {
		System.out.println("qq");
	}
	
}

class QQFactory implements CarFactory{

	@Override
	public Car getCar() {
		return new QQ();
	}
	
}