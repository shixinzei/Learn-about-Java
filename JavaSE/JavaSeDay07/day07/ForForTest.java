package day07;

public class ForForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������
		// �ϰ벿��
		for(int i=0;i<5;i++) {
			for(int j=0;j<4-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// �°벿��
		for(int i=0;i<4;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<4-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}

}
