package day20_exer1;

public class TestExer2 {
	public static void main(String[] args) {
		String str = "abcdefgho";
		str = reverse(str, 2, 5);
		System.out.println(str);
	}
	
	public static String reverse(String str, int start, int end) {
		String left = str.substring(0, start);
		String right = str.substring(end + 1);
		String middle = str.substring(start, end+1);
		
		char[] charArray = middle.toCharArray();
		for(int i=0;i<charArray.length/2;i++) {
			char temp = charArray[i];
			charArray[i] = charArray[charArray.length-1-i];
			charArray[charArray.length-1-i] = temp;
		}
		
		middle = new String(charArray);
		return left + middle + right;
	}
}
