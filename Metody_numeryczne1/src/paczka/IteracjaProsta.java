package paczka;

public class IteracjaProsta {
	private int iloscIteracji;
	private double b1 = 5.0;
	private double x0 = 0.0, f0;
	private double eps0 = 0.00000001;
	private boolean loud = true;
	public double wynik;

	/**
	 * @param x0
	 * @param iloscIteracji
	 * @param loud
	 */
	public IteracjaProsta(double x0, double iloscIteracji, boolean loud) {
		super();
		this.x0 = x0;
		this.iloscIteracji = (int) iloscIteracji;
		this.loud = loud;
		int i = (int) this.iloscIteracji;
		Wzor wzor = new Wzor(this.loud);
		// this.x0 = Math.tan(this.x0) / 2;
		do {
			f0 = wzor.ObliczPrzeksztalcone(this.x0);
			b1 = Math.abs(this.x0 - f0);
			if (!this.loud) {
				System.out.println("Po " + (this.iloscIteracji - i)
						+ " iteracji  x= " + this.x0 + " f(x) = " + f0);
			}
			this.x0 = f0;
			i--;
		} while (b1 >= eps0 && i > 0);
		wynik = this.x0;
	}
}
