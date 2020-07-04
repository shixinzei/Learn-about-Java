package day13;

public class TestUse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicTools gt = new GraphicTools();
		Circle2 c1 = new Circle2(1);
		Circle2 c2 = new Circle2(1);
		
		boolean flag = gt.compare(c1, c2);
		System.out.println(flag);
		
		Rectangle2 r1 = new Rectangle2(2,3);
		Rectangle2 r2 = new Rectangle2(3,2);
		flag = gt.compare(r1, r2);
		System.out.println(flag);
		
		Triangle t1 = new Triangle(3,4,5);
		Triangle t2 = new Triangle(3,4,5);
		flag = gt.compare(t1, t2);
		System.out.println(flag);
		
		flag = gt.compare(c1, r2);
		System.out.println(flag);
		
	}

}

class GraphicTools{
	public boolean compare(Graphic g1, Graphic g2) {
		if(g1.getArea() == g2.getArea()) {
			return true;
		}else {
			return false;
		}
	}
}