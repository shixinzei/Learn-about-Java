package day11;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1=new User();
		System.out.println(u1.age);
		
		User u2=new User(2);
		System.out.println(u2.age);
		u2.age=5;
		System.out.println(u2.age);
		
		
	}

}

class User{
	String name; 
	int age=1; //���Ե���ʾ��ʼ��
	
	public User() {}
	
	public User(int a) {
		age=a; // �����������Գ�ʼ��
	}
	
	
}