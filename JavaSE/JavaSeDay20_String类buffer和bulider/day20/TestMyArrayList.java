package day20;

public class TestMyArrayList {
	public static void main(String[] args) {
		// ��������
		MyArrayList my = new MyArrayList();
		
		// ��Ӷ���
		my.add("����");
		my.add("����");
		my.add("����");
		
		// �鿴��������
		System.out.println(my.size());
		
		// ����Ԫ��
		Object[] all = my.getAll();
		for(int i=0;i<all.length;i++) {
			System.out.println(all[i]);
		}
		
		// ��ȡĳ��λ�õ�Ԫ��
		Object obj = my.get(0);
		System.out.println(obj);
		
		// �������ĵ�λ��
		int index = my.indexOf("heh");
		System.out.println(index);
	}
}
