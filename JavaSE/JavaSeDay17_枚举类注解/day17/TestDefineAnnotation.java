package day17;
/**
 * 
 * @author wydxry
 * @date 2020年7月15日
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
		System.out.println("父类");
	}
}

class SubClass extends SuperClass{
	
	private int i;
	
	@Override
	public void test() {
		System.out.println("子类");
	}
	
}