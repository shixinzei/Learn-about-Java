package day10;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneFactory factory=new PhoneFactory();
		Phone phone1=new Phone();
		phone1.name="small mi";
		phone1.price=2222;
		factory.usePhone(phone1);
		
		//���������ʹ�� 
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
		System.out.println("ʹ���ֻ�ͨ��");
	}
	
	public void sendSMS() {
		System.out.println("���Ͷ���");
	}
	
	public void show() {
		System.out.println("name:"+name+",price:"+price);
		call();
	}
	
	
}
