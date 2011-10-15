package paczka;

public class IteracjaProsta {
	private double iloscIteracji;
	private double przyblizenie;
	private double x = 0.0, y;
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
	public IteracjaProsta(double x, double przyblizenie, double iloscIteracji,
			boolean loud) {
		super();
		this.x = x;
		this.przyblizenie = przyblizenie;
		this.iloscIteracji = iloscIteracji;
		int i = 0;
		Wzor wzor = new Wzor(this.loud);
		do {
			y = wzor.Oblicz(x);
			aktualnePrzyblizenie = Math.abs(this.x - y);
			if (!loud) {
				System.out.println("Po " + i + " iteracji \n x= " + this.x
						+ " f(x) = " + y);
			}
			this.x = y;
			i++;
		} while (aktualnePrzyblizenie >= this.przyblizenie
				&& i < this.iloscIteracji);
		wynik = x;
	}
}
