package paczka;

public class PoloweniePrzedzialow {
	int zakres0 = -3;
	int zakres1 = 3;
	boolean loud = true;

	/**
	 * @param zakres0
	 * @param zakres1
	 */
	public PoloweniePrzedzialow(int zakres0, int zakres1, boolean loud) {
		super();
		this.zakres0 = zakres0;
		this.zakres1 = zakres1;
		this.loud = loud;

		if (!loud) {
			System.out.println("zakres0 = " + this.zakres0);
		}

		if (!loud) {
			System.out.println("zakres1 = " + this.zakres1);
		}
		
		
		
		
	}
}
