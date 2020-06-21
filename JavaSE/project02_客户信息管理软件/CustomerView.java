package project02;

public class CustomerView {
	private CustomerList customerList=new CustomerList(10);
	public CustomerView() {
		Customer customer=new Customer("wang", '男', "wydxry@163.com", "12345678", 18);
		customerList.addCustomer(customer);
	}
	public void enterMainMenu() {
		//显示主界面
//		System.out.println("显示主界面");
		boolean isFlag=true;
		while(isFlag) {
			System.out.println("----------------客户管理软件----------------\n");
			System.out.println("\t\t1 添加客户");
			System.out.println("\t\t2 修改客户");
			System.out.println("\t\t3 删除客户");
			System.out.println("\t\t4 客户列表");
			System.out.println("\t\t5 退        出");
			System.out.print("\t\t请选择(1-5):");
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
				System.out.println("确认是否退出(Y/N):");
				char isExit=CMUtility.readConfirmSelection();
				if(isExit=='Y') {
					isFlag=false;
				}
			}
		}
		
		
	}
	
	public void addNewCustomer() {
		//添加新客户
//		System.out.println("add");
		System.out.println("----------添加客户-----------");
		System.out.print("姓名：");
		String name=CMUtility.readString(10);
		System.out.print("性别：");
		char gender=CMUtility.readChar();
		System.out.print("年龄：");
		int age=CMUtility.readInt();
		System.out.print("电话：");
		String phone=CMUtility.readString(11);
		System.out.print("邮箱：");
		String email=CMUtility.readString(25);
		Customer customer=new Customer(name, gender, email, phone, age);
		boolean addSuccess=customerList.addCustomer(customer);
		if(addSuccess) {
			System.out.println("----------添加完成-----------");
		}else {
			System.out.println("----------添加失败-----------");
		}
	}
	
	public void modifyCustomer() {
		//修改客户
//		System.out.println("modify");
		Customer customer;
		int number;
		for(;;) {
			System.out.println("请选择需要修改客户编号(-1退出)：");
			number=CMUtility.readInt();
			if(number==-1) {
				return ;
			}
			customer=customerList.getCustomer(number-1);
			if(customer==null) {
				System.out.println("无法找到指定的用户");
			}else {
				break;
			}
		}
		System.out.print("姓名("+customer.getName()+"):");
		String name=CMUtility.readString(10,customer.getName());
		System.out.print("性别("+customer.getGender()+"):");
		char gender=CMUtility.readChar(customer.getGender());
		System.out.print("年龄("+customer.getAge()+"):");
		int age=CMUtility.readInt(customer.getAge());
		System.out.print("电话("+customer.getPhone()+"):");
		String phone=CMUtility.readString(11,customer.getPhone());
		System.out.print("邮箱("+customer.getEmail()+"):");
		String email=CMUtility.readString(25,customer.getEmail());
		
		Customer customer2=new Customer(name, gender, email, phone, age);
		boolean isReplaced=customerList.replaceCustomer(number-1, customer2);
		if(isReplaced) {
			System.out.println("----------修改完成-----------");
		}else {
			System.out.println("----------修改失败-----------");
		}
		
	}
	
	public void deleteCustomer() {
		//删除新客户
//		System.out.println("delete");
		System.out.println("----------删除客户-----------");
		Customer customer;
		int number;
		for(;;) {
			System.out.println("请选择需要删除客户编号(-1退出)：");
			number=CMUtility.readInt();
			if(number==-1) {
				return ;
			}
			customer=customerList.getCustomer(number-1);
			if(customer==null) {
				System.out.println("无法找到指定的用户");
			}else {
				break;
			}
		}
		
		System.out.println("确认是否删除(Y/N):");
		char confirmDelete=CMUtility.readConfirmSelection();
		if(confirmDelete=='Y') {
			boolean isDelete=customerList.deleteCustomer(number-1);
			if(isDelete) {
				System.out.println("----------删除完成-----------");
			}else {
				System.out.println("----------删除失败-----------");
			}
		}
	}
	
	public void listAllCustomer() {
		//列出客户
//		System.out.println("list");
		System.out.println("----------------客户列表----------------\n");
		int total=customerList.getTotal();
		if(total==0) {
			System.out.println("没有客户记录！");
		}else {
			System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
			Customer[] customers=customerList.getAllCustomers();
			for(int i=0;i<customers.length;i++) {
				System.out.println((i+1)+"\t"+customers[i].getName()+"\t"+
						customers[i].getGender()+"\t"+customers[i].getAge()+"\t"+
						customers[i].getPhone()+"\t"+customers[i].getEmail());
			}		
		}
		System.out.println("----------------客户列表完成----------------\n");
	}
	
	public static void main(String[] args) {
		CustomerView view=new CustomerView();
		view.enterMainMenu();	
	}
}
