package paczka;

public class Sieczne {
	private double x1;
	private double x2;
	private double iloscIteracji;
	private static final double eps0 = 0.0000000001;
	private static final double epsX = 0.0000000001;
	private boolean loud;
	public double wynik;

	/**
	 * @param x1
	 * @param x2
	 * @param iloscIteracji
	 * @param epsX
	 * @param epx0
	 * @param loud
	 */
	public Sieczne(double x1, double x2, double iloscIteracji, boolean loud) {
		super();
		this.x1 = x1;
		this.x2 = x2;
		this.iloscIteracji = iloscIteracji;
		this.loud = loud;
		Wzor wzor = new Wzor(loud);
		double x0;
		double f0, f1 = wzor.Oblicz(this.x1), f2 = wzor.Oblicz(this.x2);
		while (this.iloscIteracji > 0 && Math.abs(this.x1 - this.x2) > epsX) {
			if (!loud) {
				System.out.println("x1 = " + this.x1 + " x2 = " + this.x2);
				System.out.println("f1 = " + f1 + "f2 = " + f2);
			}
			if (Math.abs(f1 - f2) < eps0) {
				if (!this.loud) {
					System.out.println("złe punkty? = " + Math.abs(f1 - f2));
				}
				System.out.println("Złe punkty startowe\n");
				this.iloscIteracji = 0;
				break;
			}
			x0 = this.x1 - f1 * (this.x1 - this.x2) / (f1 - f2);
			f0 = wzor.Oblicz(x0);
			if (Math.abs(f0) < eps0) {
				break;
			}
			this.x2 = this.x1;
			f2 = f1;
			this.x1 = x0;
			f1 = f0;
			if ((--this.iloscIteracji) <= 0) {
				System.out.println("Przekroczony limit obiegów");
			}
		}
		if (iloscIteracji > 0) {
			if (!this.loud) {
				System.out.println("wynik = " + this.x1);
			}
		}
		wynik = this.x1;
	}
}
