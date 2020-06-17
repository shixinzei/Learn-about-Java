package “Ï≥£;

class OpenException extends Exception{
	
}

class CloseException extends OpenException{
	
}

public class Test2 {
	public static int open() {
//		int[] a=new int[10];
		
		return -1;
	}
	
	public static void readFile() throws OpenException, CloseException {
		if(open()==-1) {
			throw new CloseException();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			readFile();
		} catch (CloseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Close");
		} catch (OpenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Open");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Anything");
		} 
	}

}
