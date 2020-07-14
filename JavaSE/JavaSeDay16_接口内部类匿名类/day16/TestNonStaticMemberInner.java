package day16;

public class TestNonStaticMemberInner {
	
}

class Outerr{
	private static int i;
	private int j;
	class Innerr{
		public void test() {
			System.out.println(i);
			System.out.println(j);
		}
	}
	
	public Innerr getInnerr() {
		Innerr in = new Innerr();
		return in;
	}
	
}