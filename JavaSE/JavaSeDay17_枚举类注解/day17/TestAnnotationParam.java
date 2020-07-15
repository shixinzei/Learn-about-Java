package day17;

public class TestAnnotationParam {
	
}

@A(info="atguigu")
class B{
	
}


@interface A{
	String info() default("ÉÐ¹è¹È");
}