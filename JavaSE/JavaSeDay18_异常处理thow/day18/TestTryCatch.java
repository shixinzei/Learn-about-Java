package day18;

public class TestTryCatch {
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		
		try {
			String s1 = args[0];
			String s2 = args[1];
			System.out.println("��������" + s1);
			System.out.println("������" + s2);
			
			int bei = Integer.parseInt(s1);
			int chu = Integer.parseInt(s2);
			int shang = bei/chu;
			System.out.println("�̣�" + shang);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�����ĸ�������2��");
		}catch(NumberFormatException e) {
			System.out.println("������Ϊ����");
		}catch(ArithmeticException e) {
			System.out.println("��������Ϊ��");
		}catch(Exception e) {
			System.out.println("�����쳣");
		}
	}
}
