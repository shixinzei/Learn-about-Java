package project01;

public class FamilyAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isFlag=true;
		int balance=10000;//初始金额
		String detail="收支\t账户金额\t收支金额\t说      明\n";
		while(isFlag) {
			System.out.println("---------------家庭收支记账软件------------");
//			System.out.println();
			System.out.println("\t\t1 收支明细");
			System.out.println("\t\t2 登记收入");
			System.out.println("\t\t3 登记支出");
			System.out.println("\t\t4 退       出");
//			System.out.println();
			System.out.println("请选择(1-4):");
			
			char selection = Utility.readMenuSelection();
			switch(selection) {
			case '1':
				System.out.println("收支明细");
				System.out.println("---------------当前收支明细--------------");
				System.out.println(detail);
				System.out.println("--------------------------------------");
				break;
			case '2':
				System.out.println("---------------登记收入-----------------");
				System.out.print("本次收入金额：");
				int money=Utility.readNumber();
				System.out.print("本次收支说明：");
				String explain=Utility.readString();
				balance+=money;
				detail+=("收入\t"+balance+"\t"+money+"\t"+explain+"\n");
//				System.out.println(detail);
				System.out.println("-----------------登记完成-------------");
				break;
			case '3':
				System.out.println("-----------------登记支出-------------");
				System.out.print("本次支出金额：");
				money=Utility.readNumber();
				System.out.print("本次收支说明：");
				explain=Utility.readString();
				balance-=money;
				detail+=("支出\t"+balance+"\t"+money+"\t"+explain);
//				System.out.println(detail);
				System.out.println("-----------------登记完成-------------");
				break;
			case '4':
				System.out.println("确认是否退出(Y/N)：");
				char isExit=Utility.readConfirmSelection();
				if(isExit=='Y') {
					isFlag=false;
				}
				
				break;
			}
		}
	}
}
