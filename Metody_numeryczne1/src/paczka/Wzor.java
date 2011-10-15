package paczka;

public class Wzor {
	public double wynik;
	private double x;
	private boolean loud;

	/**
	 * @param x
	 */

	public double Oblicz(double x) {
		this.x = x;
		wynik = (2 * this.x) - Math.tan(this.x);
//		if (!this.loud) {
//			System.out.println("wynik = " + wynik);
//		}
		return wynik;
	}

	public Wzor(boolean loud) {
		super();
		this.loud = loud;

	}

	/**
	 * @param wynik
	 * @param x
	 * @return
	 */
}
