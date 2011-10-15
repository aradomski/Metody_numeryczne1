package paczka;

public class PoloweniePrzedzialow {
	double zakres0;
	double zakres1;
	int zaookraglenie = 10;
	boolean loud = true;
	public double wynik;

	private double Szukaj(double zakres0, double zakres1, int zaookraglenie,
			boolean loud) {
		double result;
		double middle = (zakres0 + zakres1) / 2;
		double middleLeft = (zakres0 + middle) / 2;
		double middleRight = (middle + zakres1) / 2;
		if (!loud) {
			System.out.println("middle =" + middle);
		}
		Wzor wzor = new Wzor(middle);
		result = wzor.wynik;
		if (result == 0) {
			return result;
		} else {
			if (middleLeft > 1) {
				result = Szukaj(zakres0, middle, zaookraglenie, loud);
			}
			if (middleRight > 1) {
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
	public PoloweniePrzedzialow(double zakres0, double zakres1,
			double zaookraglenie, boolean loud) {
		super();
		this.zakres0 = zakres0;
		this.zakres1 = zakres1;
		this.zaookraglenie = (int) zaookraglenie;
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
