package day09;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1=new User();
		System.out.println("name:"+u1.name+"age:"+u1.age);
		u1.showNation();
		u1.eat("小龙虾");
		
		
		
	}

}

class User{
	String name;
	int age=1;
	boolean isMale;
	
	public void eat(String food) {
		System.out.println("喜欢吃"+food);
	}
	
	public void showNation() {
		String nation="CHN";
		System.out.println("来自于："+nation);
	}
	
	
	
}