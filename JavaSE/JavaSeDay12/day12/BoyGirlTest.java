package day12;

public class BoyGirlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boy boy=new Boy("����ŷ",23);
		Girl girl=new Girl("ףӢ̨",20);
	
		girl.marry(boy);
		
		Girl girl1=new Girl("����Ҷ",21);
		int compare=girl.compare(girl1);
		System.out.println(compare);
		
		boy.shout();
		
	}

}
