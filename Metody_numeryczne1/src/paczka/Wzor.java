package paczka;

public class Wzor {
	public double wynik;
	private double x;
	private boolean loud;

	/**
	 * @param x
	 * @return
	 */
	public double ObliczPrzeksztalcone(double x) {
		this.x = x;
		wynik = Math.sqrt((Math.tan(this.x)) / 2* this.x);
		if (!this.loud) {
			System.out.println("wynik = " + wynik);
		}
		return wynik;
	}

	/**
	 * @param x
	 */

	public double Oblicz(double x) {
		this.x = x;
		wynik = (2 * this.x) - Math.tan(this.x);
		if (!this.loud) {
			System.out.println("wynik = " + wynik);
		}
		return wynik;
	}

	/**
	 * @param loud
	 */

	public Wzor(boolean loud) {
		super();
		this.loud = loud;

	}
}
