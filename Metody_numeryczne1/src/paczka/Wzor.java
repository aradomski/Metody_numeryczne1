package paczka;

public class Wzor {
	public double wynik;
	private double x;

	/**
	 * @param x
	 */
	public Wzor(double x) {
		super();
		this.x = x;

		wynik = (2 * this.x) - Math.tan(this.x);

		System.out.println("wynik = " + wynik);
	}

	/**
	 * @param wynik
	 * @param x
	 * @return
	 */
}
