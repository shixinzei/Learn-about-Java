package day13;


public class TestUse1 {
	// 多态的应用
	public static void main(String[] args) {
		Circle2[] arr1 = new Circle2[3]; 
		Rectangle2[] arr2 = new Rectangle2[3];
		Graphic[] arr3 = new Graphic[3];
		arr3[0] = new Circle2(1.2);
		arr3[1] = new Circle2(2.2);
		arr3[2] = new Rectangle2(3, 2);
		for(int i = 0;i < arr3.length;i++) {
			System.out.println("面积：" + arr3[i].getArea());
		}
		
		
	}
}