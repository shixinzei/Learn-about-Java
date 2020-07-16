package day20_exer1;

public class TestExer1 {
	public static void main(String[] args) {
		String str = trim("   hello world 	 ");
		System.out.println("[" + str + "]");
	}
	
	public static String trim(String str) {
		char[] array = str.toCharArray();
		int startIndex = 0;
		int endIndex = array.length-1;
		for(int i=0;i<array.length;i++) {
			if(array[i] <= ' ') {
				startIndex++;
			}else {
				break;
			}
		}
		for(int i=array.length-1;i>=0;i--) {
			if(array[i] <= ' ') {
				endIndex--;
			}else {
				break;
			}
		}
		
//		String result = new String(array, startIndex, endIndex-startIndex+1);
//		return result;
		return str.substring(startIndex, endIndex + 1);
	}
	
	
	
}
