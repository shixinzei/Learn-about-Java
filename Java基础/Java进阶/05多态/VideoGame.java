package ∂‡Ã¨;

public class VideoGame extends Item {
	private int numberOfPlayers;
	
	public VideoGame(String title, int playingtime, boolean gotIt, String comment,
			int number) {
		super(title, playingtime, gotIt, comment);
		// TODO Auto-generated constructor stub
		this.numberOfPlayers=number;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("VideoGame: ");
		super.print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
