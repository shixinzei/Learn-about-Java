package day03;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class VariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short s1=10;
		int i1=20;
		// �Զ�����ת��
		int i2=s1+i1;
		System.out.println(i2);
		
		long l1=123L;
		float f1=123.F;
//		long l1=f1+l1; //���벻ͨ��
		float f2=l1+f1;
		System.out.println(f2);
		
		char c1='a'; //ascii��ֵΪ97
		int i3=c1+i1;
		System.out.println(i3);
		
		byte b1=12;
		short s2=20;
//		short s3=b1+s2; //���벻ͨ�� int����
//		char c2=b1+c1; //���벻ͨ�� int����
//		short s4=s2+c1; //���벻ͨ�� int����
		
		byte b2=10;
//		byte b3=b1+b2; //���벻ͨ�� int����
		
		//���ͳ���Ĭ��Ϊint����
		short s5=10;
		int i4=s5+2;
		
		//�����ͳ���Ĭ��Ϊdouble����
//		float f3=s5+2.1; //���벻ͨ�� double����
		double d1=s5+2.1;
		
		long l2=1234L;
		System.out.println(l2);
		
		long l3=1234; //�Զ���������
		System.out.println(l3);
		
		float f3=123.4F;
//		float f4=123.4; //���벻ͨ�� double����
		
		long l4=23456456456L;
		System.out.println(l4);
		
	}

}
