package project01;

public class FamilyAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isFlag=true;
		int balance=10000;//��ʼ���
		String detail="��֧\t�˻����\t��֧���\t˵      ��\n";
		while(isFlag) {
			System.out.println("---------------��ͥ��֧�������------------");
//			System.out.println();
			System.out.println("\t\t1 ��֧��ϸ");
			System.out.println("\t\t2 �Ǽ�����");
			System.out.println("\t\t3 �Ǽ�֧��");
			System.out.println("\t\t4 ��       ��");
//			System.out.println();
			System.out.println("��ѡ��(1-4):");
			
			char selection = Utility.readMenuSelection();
			switch(selection) {
			case '1':
				System.out.println("��֧��ϸ");
				System.out.println("---------------��ǰ��֧��ϸ--------------");
				System.out.println(detail);
				System.out.println("--------------------------------------");
				break;
			case '2':
				System.out.println("---------------�Ǽ�����-----------------");
				System.out.print("���������");
				int money=Utility.readNumber();
				System.out.print("������֧˵����");
				String explain=Utility.readString();
				balance+=money;
				detail+=("����\t"+balance+"\t"+money+"\t"+explain+"\n");
//				System.out.println(detail);
				System.out.println("-----------------�Ǽ����-------------");
				break;
			case '3':
				System.out.println("-----------------�Ǽ�֧��-------------");
				System.out.print("����֧����");
				money=Utility.readNumber();
				System.out.print("������֧˵����");
				explain=Utility.readString();
				balance-=money;
				detail+=("֧��\t"+balance+"\t"+money+"\t"+explain);
//				System.out.println(detail);
				System.out.println("-----------------�Ǽ����-------------");
				break;
			case '4':
				System.out.println("ȷ���Ƿ��˳�(Y/N)��");
				char isExit=Utility.readConfirmSelection();
				if(isExit=='Y') {
					isFlag=false;
				}
				
				break;
			}
		}
	}
}
