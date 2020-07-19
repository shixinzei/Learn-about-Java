package project03.team.bean;

public class Printer implements Equipment{
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Printer() {
		super();
	}
	public Printer(String type, String name) {
		super();
		this.type = type;
		this.name = name;
	}
	private String type;
	private String name;
	@Override
	public String getDescription() {
		
		return name + "(" + type + ")";
	}
}
