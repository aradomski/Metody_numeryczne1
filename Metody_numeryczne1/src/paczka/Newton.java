package paczka;

public class Newton {

	public double wynik;
	private boolean loud = true;
	private static final double eps0 = 0.0000000001;
	private static final double epsX = 0.0000000001;
	private double iloscIteracji;
	private double x0; // x początkowy

	private double Pochodna(double x) {
		return x = 2 - 4 * (Math.pow(Math.cos(x), 2))
				/ Math.pow((1 + Math.cos(2 * x)), 2);
	}

	/**
	 * @param x0
	 * @param iloscIteracji
	 * @param loud
	 */
	public Newton(double x0, double iloscIteracji, boolean loud) {
		super();
		this.x0 = x0;
		this.iloscIteracji = iloscIteracji;
		this.loud = loud;
		Wzor wzor = new Wzor(loud);
		double x1 = this.x0 - 1;
		double f0 = wzor.Oblicz(x0), f1;
		int i = (int) this.iloscIteracji;
		while (i > 0 && Math.abs(x1 - this.x0) > epsX && Math.abs(f0) > eps0) {
			f1 = Pochodna(this.x0);
			if (Math.abs(f1) < eps0) {
				System.out.println("Zły punkt startowy");
				wynik = -1000;
				break;
			}
			x1 = this.x0;
			this.x0 = this.x0 - f0 / f1;
			f0 = wzor.Oblicz(this.x0);
			i--;
			if (i == 0) {
				System.out.println("Przekroczono limit obiegów");
			}
		}
		if (!this.loud) {
			System.out.println("wynik =" + wynik);
		}
		wynik = this.x0;
	}
}
