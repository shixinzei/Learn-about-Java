package day17;
/**
 * 
 * @author wydxry
 * @date 2020��7��15��
 */
public class TestDefineAnnotation {
	
}

@MyAnnotation
class MyClass{
	@MyAnnotation
	private int i;
	
	@MyAnnotation
	public void test() {
		
	}
}


@interface MyAnnotation{
	
}

class SuperClass{
	public void test() {
		System.out.println("����");
	}
}

class SubClass extends SuperClass{
	
	private int i;
	
	@Override
	public void test() {
		System.out.println("����");
	}
	
}