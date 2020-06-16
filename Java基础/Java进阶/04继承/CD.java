package ผฬณะ;

public class CD extends Item{
	private String artist;
	private int numofTracks;

	public CD(String title, String artist, int playingtime, String comment) {
		super(title,playingtime,false,comment);
//		this.title = title;
//		setTitle("cccddd");
		this.artist = artist;
		this.numofTracks = numofTracks;
//		this.playingtime = playingtime;
//		this.comment = comment;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CD cd=new CD("aaa","bbb",1, "...");
		cd.print();
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.print("CD:");
		super.print();
		System.out.println(" "+artist);
	}

}
