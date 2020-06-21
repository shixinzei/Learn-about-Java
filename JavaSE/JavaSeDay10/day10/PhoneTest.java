package day10;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneFactory factory=new PhoneFactory();
		Phone phone1=new Phone();
		phone1.name="small mi";
		phone1.price=2222;
		factory.usePhone(phone1);
		
		//匿名对象的使用 
		new Phone().name="huawei";
		factory.usePhone(new Phone());
		
	}

}

class PhoneFactory{
	public void usePhone(Phone phone) {
		phone.show();
//		phone.call();
//		phone.sendSMS();
	}
}


class Phone{
	String name;
	int price;
	
	public void call() {
		System.out.println("使用手机通话");
	}
	
	public void sendSMS() {
		System.out.println("发送短信");
	}
	
	public void show() {
		System.out.println("name:"+name+",price:"+price);
		call();
	}
	
	
}
