package day17_exer1;

public class TestEmployee {
	public static void main(String[] args) {
		Employee[] all = new Employee[5];
		all[0] = new Employee(1, "张三", Status.BUSY);
		all[1] = new Employee(2, "李四", Status.BUSY);
		all[2] = new Employee(3, "王五", Status.VACATION);
		all[3] = new Employee(4, "赵六", Status.LEFT);
		all[4] = new Employee(5, "钱七", Status.FREE);
		
		for(int i=0;i<all.length;i++) {
			System.out.println(all[i]);
		}
	}
}

class Employee{
	private int eid;
	private String name;
	private Status status;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Employee(int eid, String name, Status status) {
		super();
		this.eid = eid;
		this.name = name;
		this.status = status;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", status=" + status + "]";
	}
	
}