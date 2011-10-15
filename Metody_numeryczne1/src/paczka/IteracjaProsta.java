package paczka;

public class IteracjaProsta {
	private double iloscIteracji;
	private double przyblizenie;
	private double zakres0 = 0.0, zakres1;
	private double aktualnePrzyblizenie = 1.0;
	private boolean loud = true;
	public double wynik;

	/**
	 * @param zakres0
	 * @param zakres1
	 * @param przyblizenie
	 * @param iloscIteracji
	 * @param loud
	 */
	public IteracjaProsta(double zakres0, double zakres1, double przyblizenie,
			double iloscIteracji, boolean loud) {
		super();
		this.zakres0 = zakres0;
		this.zakres1 = zakres1;
		this.przyblizenie = przyblizenie;
		this.iloscIteracji = iloscIteracji;
	}

}
