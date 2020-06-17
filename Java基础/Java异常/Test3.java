package “Ï≥£;

class OpenException extends Exception{}
class CloseException extends OpenException{}
class NewException extends Exception{}

public class Test3 {
	public void f() throws OpenException {
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
	}
}

class NewClass extends Test3
{
	public void f() throws OpenException{}
	public static void main(String[] args) {
		Test3 p=new NewClass();
		try {
			p.f();
		} catch (OpenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}