package paczka;

import java.math.BigDecimal;

public class PoloweniePrzedzialow {
	BigDecimal zakres0 = null;
	BigDecimal zakres1 = null;
	int zaookraglenie = 10;
	boolean loud = true;
	public BigDecimal wynik;

	private BigDecimal Szukaj(BigDecimal zakres0, BigDecimal zakres1,
			int zaookraglenie, boolean loud) {
		BigDecimal result = null;
		BigDecimal middle = (zakres0.add(zakres1)).divide(new BigDecimal(2),
				zaookraglenie, BigDecimal.ROUND_HALF_UP);
		BigDecimal middleLeft = (zakres0.add(middle)).divide(new BigDecimal(2),
				zaookraglenie, BigDecimal.ROUND_HALF_UP);
		BigDecimal middleRight = (middle.add(zakres1)).divide(
				new BigDecimal(2), zaookraglenie, BigDecimal.ROUND_HALF_UP);
		if (!loud) {
			System.out.println("middle =" + middle.toString());
		}
		Wzor wzor = new Wzor(middle);
		result = wzor.wynik;
		if (result.equals(0)) {
			return result;
		} else {
			if ((middleLeft.signum()) == 1) {
				result = Szukaj(zakres0, middle, zaookraglenie, loud);
			}
			if ((middleRight.signum()) == 1) {
				result = Szukaj(middle, zakres1, zaookraglenie, loud);
			} else {
				return result;
			}
			return result;
		}
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

		if (!loud) {
			System.out.println("zakres0 = " + this.zakres0);
		}

		if (!loud) {
			System.out.println("zakres1 = " + this.zakres1);
		}
		if (!loud) {
			System.out.println("zaookraglenie  =" + this.zaookraglenie);
		}
		wynik = Szukaj(this.zakres0, this.zakres1, this.zaookraglenie,
				this.loud);
	}
}
