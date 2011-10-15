package paczka;

public class PoloweniePrzedzialow {
	double zakres0;
	double zakres1;
	int zaookraglenie = 10;
	boolean loud = true;
	public double wynik;
	double epsilon;
	double metoda;

	private double Szukaj(double zakres0, double zakres1, double epsilon,
			double metoda, boolean loud) {
		double result;
		double middle = (zakres0 + zakres1) / 2;
		Wzor wzor = new Wzor(loud);
		double middleLeft = wzor.Oblicz(zakres0) * wzor.Oblicz(middle);
		double middleRight = wzor.Oblicz(middle) * wzor.Oblicz(zakres1);
		if (!loud) {
			System.out.println("middle =" + middle);
		}
		result = wzor.Oblicz(middle);
		if (metoda == 1) {
			// wersja petlowa precyzja do 0.006
			if (wzor.Oblicz(zakres0) * wzor.Oblicz(zakres1) < 0) {
				result = zakres0;

				if (!loud) {
					System.out.println("result = " + result);
				}
				while ((zakres1 - zakres0) >= epsilon) {
					result = (zakres1 + zakres0) / 2.0;
					if (!loud) {
						System.out.println("result = " + result);
					}
					if (wzor.Oblicz(zakres0) * wzor.Oblicz(result) < 0) {
						zakres1 = result;
						if (!loud) {
							System.out.println("result = " + result);
						}
					} else if (wzor.Oblicz(result) * wzor.Oblicz(zakres1) < 0) {
						zakres0 = result;
						if (!loud) {
							System.out.println("result = " + result);
						}
					} else
						break;
				}
			}
		} else {
			// Wersja rekurencyjna
			if (wzor.Oblicz(zakres0) * wzor.Oblicz(middle) < 0
					&& middle - zakres0 > epsilon) {
				if (!loud) {
					System.out.println("middle - zakres0 = "
							+ (middle - zakres0));
					System.out.println("middleLeft = " + middleLeft);
				}
				result = Szukaj(zakres0, middle, epsilon, metoda, loud);
			}
			if (wzor.Oblicz(middle) * wzor.Oblicz(zakres1) < 0
					&& zakres1 - middle > epsilon) {
				if (!loud) {
					System.out
							.println("zakres1-middle = " + (zakres1 - middle));
					System.out.println("middleRight = " + middleRight);
				}
				result = Szukaj(middle, zakres1, epsilon, metoda, loud);
			} else {
				return result;
			}
		}
		return result;
	}

	/**
	 * @param zakres0
	 * @param zakres1
	 */
	public PoloweniePrzedzialow(double zakres0, double zakres1, double epsilon,
			double metoda, boolean loud) {
		super();
		this.zakres0 = zakres0;
		this.zakres1 = zakres1;
		this.loud = loud;
		this.epsilon = epsilon;
		this.metoda = metoda;

		if (!loud) {
			System.out.println("zakres0 = " + this.zakres0);
		}

		if (!loud) {
			System.out.println("zakres1 = " + this.zakres1);
		}

		wynik = Szukaj(this.zakres0, this.zakres1, this.epsilon, this.metoda,
				this.loud);
	}
}
