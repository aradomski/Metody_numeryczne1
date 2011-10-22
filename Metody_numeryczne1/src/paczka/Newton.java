package paczka;

public class Newton {

	public double wynik;
	private boolean loud = true;
	private static final double eps0 = 0.0000000001;
	private static final double epsX = 0.0000000001;
	private double iloscIteracji;
	private double x0; // x początkowy

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
	}
}
