package day18;

public class TestTryCatch {
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		
		try {
			String s1 = args[0];
			String s2 = args[1];
			System.out.println("被除数：" + s1);
			System.out.println("除数：" + s2);
			
			int bei = Integer.parseInt(s1);
			int chu = Integer.parseInt(s2);
			int shang = bei/chu;
			System.out.println("商：" + shang);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("参数的个数少于2个");
		}catch(NumberFormatException e) {
			System.out.println("参数不为整数");
		}catch(ArithmeticException e) {
			System.out.println("除数不能为零");
		}catch(Exception e) {
			System.out.println("所有异常");
		}
	}
}
