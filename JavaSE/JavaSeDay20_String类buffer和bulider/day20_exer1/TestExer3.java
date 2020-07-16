package day20_exer1;

public class TestExer3 {
	public static void main(String[] args) {
		String src = "ababdsadbabasdab";
		String sub = "ab";
		System.out.println(count(src, sub));
	}

	public static int count(String str, String sub) {
		int count = 0;
		while(str.indexOf(sub)!=-1) {
			int index = str.indexOf(sub);
			str = str.substring(index+sub.length());
			count++;
		}
		return count;
	}
}

