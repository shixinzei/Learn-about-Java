package project02;

public class CustomerView {
	private CustomerList customerList=new CustomerList(10);
	public CustomerView() {
		Customer customer=new Customer("wang", '��', "wydxry@163.com", "12345678", 18);
		customerList.addCustomer(customer);
	}
	public void enterMainMenu() {
		//��ʾ������
//		System.out.println("��ʾ������");
		boolean isFlag=true;
		while(isFlag) {
			System.out.println("----------------�ͻ��������----------------\n");
			System.out.println("\t\t1 ��ӿͻ�");
			System.out.println("\t\t2 �޸Ŀͻ�");
			System.out.println("\t\t3 ɾ���ͻ�");
			System.out.println("\t\t4 �ͻ��б�");
			System.out.println("\t\t5 ��        ��");
			System.out.print("\t\t��ѡ��(1-5):");
			char menu=CMUtility.readMenuSelection();
			switch(menu) {
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomer();
				break;
			case '5':
				System.out.println("ȷ���Ƿ��˳�(Y/N):");
				char isExit=CMUtility.readConfirmSelection();
				if(isExit=='Y') {
					isFlag=false;
				}
			}
		}
		
		
	}
	
	public void addNewCustomer() {
		//����¿ͻ�
//		System.out.println("add");
		System.out.println("----------��ӿͻ�-----------");
		System.out.print("������");
		String name=CMUtility.readString(10);
		System.out.print("�Ա�");
		char gender=CMUtility.readChar();
		System.out.print("���䣺");
		int age=CMUtility.readInt();
		System.out.print("�绰��");
		String phone=CMUtility.readString(11);
		System.out.print("���䣺");
		String email=CMUtility.readString(25);
		Customer customer=new Customer(name, gender, email, phone, age);
		boolean addSuccess=customerList.addCustomer(customer);
		if(addSuccess) {
			System.out.println("----------������-----------");
		}else {
			System.out.println("----------���ʧ��-----------");
		}
	}
	
	public void modifyCustomer() {
		//�޸Ŀͻ�
//		System.out.println("modify");
		Customer customer;
		int number;
		for(;;) {
			System.out.println("��ѡ����Ҫ�޸Ŀͻ����(-1�˳�)��");
			number=CMUtility.readInt();
			if(number==-1) {
				return ;
			}
			customer=customerList.getCustomer(number-1);
			if(customer==null) {
				System.out.println("�޷��ҵ�ָ�����û�");
			}else {
				break;
			}
		}
		System.out.print("����("+customer.getName()+"):");
		String name=CMUtility.readString(10,customer.getName());
		System.out.print("�Ա�("+customer.getGender()+"):");
		char gender=CMUtility.readChar(customer.getGender());
		System.out.print("����("+customer.getAge()+"):");
		int age=CMUtility.readInt(customer.getAge());
		System.out.print("�绰("+customer.getPhone()+"):");
		String phone=CMUtility.readString(11,customer.getPhone());
		System.out.print("����("+customer.getEmail()+"):");
		String email=CMUtility.readString(25,customer.getEmail());
		
		Customer customer2=new Customer(name, gender, email, phone, age);
		boolean isReplaced=customerList.replaceCustomer(number-1, customer2);
		if(isReplaced) {
			System.out.println("----------�޸����-----------");
		}else {
			System.out.println("----------�޸�ʧ��-----------");
		}
		
	}
	
	public void deleteCustomer() {
		//ɾ���¿ͻ�
//		System.out.println("delete");
		System.out.println("----------ɾ���ͻ�-----------");
		Customer customer;
		int number;
		for(;;) {
			System.out.println("��ѡ����Ҫɾ���ͻ����(-1�˳�)��");
			number=CMUtility.readInt();
			if(number==-1) {
				return ;
			}
			customer=customerList.getCustomer(number-1);
			if(customer==null) {
				System.out.println("�޷��ҵ�ָ�����û�");
			}else {
				break;
			}
		}
		
		System.out.println("ȷ���Ƿ�ɾ��(Y/N):");
		char confirmDelete=CMUtility.readConfirmSelection();
		if(confirmDelete=='Y') {
			boolean isDelete=customerList.deleteCustomer(number-1);
			if(isDelete) {
				System.out.println("----------ɾ�����-----------");
			}else {
				System.out.println("----------ɾ��ʧ��-----------");
			}
		}
	}
	
	public void listAllCustomer() {
		//�г��ͻ�
//		System.out.println("list");
		System.out.println("----------------�ͻ��б�----------------\n");
		int total=customerList.getTotal();
		if(total==0) {
			System.out.println("û�пͻ���¼��");
		}else {
			System.out.println("���\t����\t�Ա�\t����\t�绰\t\t����");
			Customer[] customers=customerList.getAllCustomers();
			for(int i=0;i<customers.length;i++) {
				System.out.println((i+1)+"\t"+customers[i].getName()+"\t"+
						customers[i].getGender()+"\t"+customers[i].getAge()+"\t"+
						customers[i].getPhone()+"\t"+customers[i].getEmail());
			}		
		}
		System.out.println("----------------�ͻ��б����----------------\n");
	}
	
	public static void main(String[] args) {
		CustomerView view=new CustomerView();
		view.enterMainMenu();	
	}
}
