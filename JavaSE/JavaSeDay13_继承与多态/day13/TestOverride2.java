package day13;

public class TestOverride2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}

}
//Object��һ�������࣬������ĸ���
class A{
	public Object test() {
		return null;
	}
	
}
class B extends A{
	//��дʱ������ֵ���Ϳ��Ժ͸���һ��
//	public Object test() {
//		return null;
//	}
	//��дʱ������ֵ���Ϳ��Ժ͸��಻һ����String<Object
	public String test() {
		return "";
	}
	
}

class C {
	// A��������������
	public A test() {
		return null;
	}
	
}

class D extends C{
//	public A test() {
//		return null;
//	}
	
	public B test() {
		return null;
	}
}

