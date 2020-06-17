package ∂‡Ã¨;

public class CD extends Item{
	private String artist;
	private int numofTracks;

	public CD(String title, String artist, int numofTracks,int playingtime, String comment) {
		super(title,playingtime,false,comment);
//		this.title = title;
//		setTitle("cccddd");
		this.artist = artist;
		this.numofTracks = numofTracks;
//		this.playingtime = playingtime;
//		this.comment = comment;
	}

	@Override
	public String toString() {
		return "CD [artist=" + artist + ", numofTracks=" + numofTracks + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		CD cc=(CD)obj;
		return artist.equals(cc.artist);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CD cd=new CD("aaa","bbb",1,1, "...");
		CD cd1=new CD("aaa","bbb",1,1, "...");
		System.out.println(cd.equals(cd1));
//		cd.print();
//		String s="aa"+cd;
//		System.out.println(s);
//		System.out.println(cd.toString());
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.print("CD:");
		super.print();
		System.out.println(" "+artist);
	}

}
