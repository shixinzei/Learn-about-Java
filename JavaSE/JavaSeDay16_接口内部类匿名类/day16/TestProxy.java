package day16;

public class TestProxy {
	public static void main(String[] args) {
		UserDAO bei = new UserDAO();
		UserDAOProxy up = new UserDAOProxy(bei);
		up.add();
		
	}
}

interface DAO{
	void add();
}

class UserDAO implements DAO{

	@Override
	public void add() {
		System.out.println("����û�");
	}
	
}

class UserDAOProxy implements DAO{
	private DAO target;
	
	public UserDAOProxy(DAO target) {
		super();
		this.target = target;
	}

	@Override
	public void add() {
		System.out.println("add������ʼִ��");
		long start = System.currentTimeMillis();
		
		//����ҵ���߼�
		target.add();
		
		long end = System.currentTimeMillis();
		System.out.println("��ʱ��" + (end - start));
		System.out.println("add��������ִ��");
	}
	
}