package day17;

public class TestEnumType {
	public static void main(String[] args) {
		Week monday = Week.MONDAY;
		System.out.println(monday);
		
		switch(monday) {
		case MONDAY:
			System.out.println("����һ");
			break;
		case TUESDAY:
			System.out.println("���ڶ�");
			break;
		}
	}
}	

// Ĭ��˽�е�
enum Week{
	MONDAY("����һ", "������һ��"),
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY;
	private String name;
	private String desc;
	private Week(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}
	private Week() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	// ��дEnum���toString���� 
//	public String toString() {
//		return name + ":" + desc;
//	}
}