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
		System.out.println("添加用户");
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
		System.out.println("add方法开始执行");
		long start = System.currentTimeMillis();
		
		//核心业务逻辑
		target.add();
		
		long end = System.currentTimeMillis();
		System.out.println("耗时：" + (end - start));
		System.out.println("add方法结束执行");
	}
	
}