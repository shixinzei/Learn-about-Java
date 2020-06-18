package day06;

public class BreakContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			if(i%4==0) {
				break;
			}
			System.out.println(i);
		}
		
		for(int i=1;i<=10;i++) {
			if(i%4==0) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("-------");
		
		// 带标签的循环
		label:for(int i=1;i<=4;i++) {
			for(int j=1;j<=10;j++) {
				if(j%4==0) {
					break label;
				}
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 带标签的循环
		label2:for(int i=1;i<=4;i++) {
			for(int j=1;j<=10;j++) {
				if(j%4==0) {
					continue label2;
				}
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
