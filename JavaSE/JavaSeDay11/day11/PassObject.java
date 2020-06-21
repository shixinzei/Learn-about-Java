package day11;

public class PassObject {
	public void printAreas(Circle c,int time) {
		System.out.println("°ë¾¶"+"\t"+"Ãæ»ý");
		for(int i=1;i<=time;i++) {
			c.setRadius(i);
			System.out.println(c.getRadius()+"\t"+c.findArea());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		PassObject po=new PassObject();
		po.printAreas(c,5);
		
	}

}
