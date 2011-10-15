package paczka;

import java.math.BigDecimal;

public class Wzor {
	BigDecimal wynik = null;
	BigDecimal x = null;

	/**
	 * @param x
	 */
	public Wzor(BigDecimal x) {
		super();
		this.x = x;
	}

	/**
	 * @param wynik
	 * @param x
	 * @return
	 */
	public BigDecimal Oblicz() {
		wynik = (this.x.multiply(new BigDecimal(2)).subtract(new BigDecimal(Math
				.tan(this.x.doubleValue()))));
		return wynik;
	}
}
