package day11;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1=new Animal();
		a1.eat();
//		a1.name="panda";
//		a1.legs=4;
		a1.setLegs(8);
		System.out.println("腿的个数是："+a1.getLegs());
		a1.setName("panda");
		System.out.println("姓名是："+a1.getName());
		
	}

}

class Animal{
	private String name;
	private int legs;
	
	public void eat() {
		System.out.println("动物进食");
	}
	
	public void sleep() {
		System.out.println("动物睡觉");
	}
	
	public void setLegs(int l) {
		if(l<0||l%2!=0||l>36) {
//			System.out.println("输入不合法");
			throw new RuntimeException("输入不合法");
		}else {
			legs=l;
		}
	}
	
	public int getLegs() {
		return legs;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name=n;
	}
}
