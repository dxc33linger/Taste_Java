package dome;

public class CD extends Item {
	private int NumberofTracks = 0;

	public CD(String title, int NoT) {
		super(title);// this command will call constructor of Item
		NumberofTracks = NoT;

	}

	public void print() {
		super.print();
		System.out.println("Track of CD: " + NumberofTracks);
	}

	public int getNoT() {
		return NumberofTracks;
	}
	
	public static void main(String[] args) {
		CD cd = new CD("second life", 7);
		cd.print();
	}
}
