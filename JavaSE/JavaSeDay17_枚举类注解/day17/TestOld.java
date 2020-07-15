package day17;

public class TestOld {
	public static void main(String[] args) {
		Season s = Season.SPRING;
		
		Season w = Season.WINTER;
		System.out.println(w);

		Season w2 = Season.WINTER;
		System.out.println(w == w2);
		
	}
}

class Season{
	public static final Season SPRING = new Season();
	public static final Season SUMMER = new Season();
	public static final Season AUTUMN = new Season();
	public static final Season WINTER = new Season("¶¬Ìì", "¶³µÃÒªËÀ");
	private String name;
	private String desc;
	private Season() {
		
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
	public Season(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Season [name=" + name + ", desc=" + desc + "]";
	}
	
}