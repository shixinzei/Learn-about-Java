package day09;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1=new User();
		System.out.println("name:"+u1.name+"age:"+u1.age);
		u1.showNation();
		u1.eat("С��Ϻ");
		
		
		
	}

}

class User{
	String name;
	int age=1;
	boolean isMale;
	
	public void eat(String food) {
		System.out.println("ϲ����"+food);
	}
	
	public void showNation() {
		String nation="CHN";
		System.out.println("�����ڣ�"+nation);
	}
	
	
	
}