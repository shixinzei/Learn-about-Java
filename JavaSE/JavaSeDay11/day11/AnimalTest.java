package day11;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1=new Animal();
		a1.eat();
//		a1.name="panda";
//		a1.legs=4;
		a1.setLegs(8);
		System.out.println("�ȵĸ����ǣ�"+a1.getLegs());
		a1.setName("panda");
		System.out.println("�����ǣ�"+a1.getName());
		
	}

}

class Animal{
	private String name;
	private int legs;
	
	public void eat() {
		System.out.println("�����ʳ");
	}
	
	public void sleep() {
		System.out.println("����˯��");
	}
	
	public void setLegs(int l) {
		if(l<0||l%2!=0||l>36) {
//			System.out.println("���벻�Ϸ�");
			throw new RuntimeException("���벻�Ϸ�");
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
