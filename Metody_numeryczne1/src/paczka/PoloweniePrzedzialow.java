package paczka;

import java.math.BigDecimal;

public class PoloweniePrzedzialow {
	BigDecimal zakres0 = null;
	BigDecimal zakres1 = null;
	int zaookraglenie = 10;
	boolean loud = true;

	private BigDecimal Szukaj(BigDecimal zakres0, BigDecimal zakres1,
			int zaookraglenie, boolean loud) {
		BigDecimal wynik = null;
		BigDecimal middle = (zakres0.add(zakres1)).divide(new BigDecimal(2), zaookraglenie,
				BigDecimal.ROUND_HALF_UP);

		if (!loud) {
			System.out.println("middle =" + middle.toString());
		}
		
		

		return wynik;
	}

	/**
	 * @param zakres0
	 * @param zakres1
	 */
	public PoloweniePrzedzialow(BigDecimal zakres0, BigDecimal zakres1,
			BigDecimal zaookraglenie, boolean loud) {
		super();
		this.zakres0 = zakres0;
		this.zakres1 = zakres1;
		this.zaookraglenie = Integer.parseInt(zaookraglenie.toString());
		this.loud = loud;
		BigDecimal wynik;

		if (!loud) {
			System.out.println("zakres0 = " + this.zakres0);
		}

		if (!loud) {
			System.out.println("zakres1 = " + this.zakres1);
		}
		if (!loud) {
			System.out.println("zaookraglenie  =" + this.zaookraglenie);
		}
		Szukaj(this.zakres0, this.zakres1, this.zaookraglenie, this.loud);
	}
}
