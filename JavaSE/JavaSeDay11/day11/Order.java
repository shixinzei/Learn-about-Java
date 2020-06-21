package day11;

public class Order {
	private int orderPrivate;
	int orderDefault;
	public int orderPublic;
	
	private void methodPrivate() {
		orderPrivate=1;
		orderDefault=2;
		orderPublic=3;
	}
	
	void methodDefault() {
		orderPrivate=1;
		orderDefault=2;
		orderPublic=3;
		methodPrivate();
	}
	
	public void methodPublic() {
		orderPrivate=1;
		orderDefault=2;
		orderPublic=3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
