package ��ʶJava;

import java.util.Scanner;

public class Chepiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ʼ��
		Scanner in = new Scanner(System.in);
		System.out.println("��Ͷ��:");
		int amount = in.nextInt();
		System.out.println(amount);
		System.out.println(amount>=10);
		if(amount>=10)
		{
			// ��ӡ��Ʊ
			System.out.println("************");
			System.out.println("Java�Ǽ���·ר��");
			System.out.println("��ָ����λƱ");
			System.out.println("Ʊ�ۣ�10Ԫ");
			System.out.println("************");
			// ���㲢��ӡ����
			System.out.println("���㣺"+(amount-10));
		}
		
	}

}
