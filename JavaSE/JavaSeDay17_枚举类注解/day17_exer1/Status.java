package day17_exer1;

public enum Status {
	FREE("����"),BUSY("æ"),VACATION("�ݼ�"),LEFT("��ְ");
	
	private String desc;

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	private Status(String desc) {
		this.desc = desc;
	}
	
	public String toString() {
		return name() + ":" + "desc";
	}
	
}
