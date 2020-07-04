package day13;

public class TestConstructor {
	
}

class SuperClass1{
	
}

class SubClass1 extends SuperClass1{
	
}

class SuperClass2{
	public SuperClass2() {
		// TODO Auto-generated constructor stub
	}
}

class SubClass2 extends SuperClass2{
	
}

class SubClass2_2 extends SuperClass2{
	SubClass2_2() {
		// TODO Auto-generated constructor stub
//		super();
	}
}

class SuperClass3{
	private String info;
	SuperClass3(String info) {
		// TODO Auto-generated constructor stub
		this.info = info;
	}
}

class SubClass3 extends SuperClass3{
	SubClass3(String info) {
		// TODO Auto-generated constructor stub
		super(info);
	}
	
}

class SubClass3_3 extends SuperClass3{
	SubClass3_3() {
		// TODO Auto-generated constructor stub
		super("");
	}
}
	
class SuperClass4{
	private String info;
	SuperClass4() {
		// TODO Auto-generated constructor stub
	}
	SuperClass4(String info) {
		this.info = info;
	}
}

class SubClass4 extends SuperClass4{
	
}

class SubClass4_2 extends SuperClass4{
	SubClass4_2(String info){
		super(info);
	}
}

class SubClass4_3 extends SuperClass4{
	SubClass4_3(){
		
	}
	SubClass4_3(String info){
		super(info);
	}
}