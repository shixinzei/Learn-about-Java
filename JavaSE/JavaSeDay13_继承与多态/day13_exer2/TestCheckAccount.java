package day13_exer2;

public class TestCheckAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckAccount c = new CheckAccount("111", 20000, 0.045, 5000);
		c.withdraw(5000);
		System.out.println("余额：" + c.getBalance());
		System.out.println("可透支额度" + c.getOverdraft());
		System.out.println();
		
		c.withdraw(18000);
		System.out.println("余额：" + c.getBalance());
		System.out.println("可透支额度" + c.getOverdraft());
		System.out.println();
		
		c.withdraw(3000);
		System.out.println("余额：" + c.getBalance());
		System.out.println("可透支额度" + c.getOverdraft());
		System.out.println();
		
		c.deposit(1000);
		System.out.println("余额：" + c.getBalance());
		System.out.println("可透支额度" + c.getOverdraft());
		System.out.println();
		
		c.withdraw(5000);
		System.out.println("余额：" + c.getBalance());
		System.out.println("可透支额度" + c.getOverdraft());
		System.out.println();
		
	}

}
