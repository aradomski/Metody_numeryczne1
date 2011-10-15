package paczka;

import java.math.BigDecimal;

public class Wzor {
	public BigDecimal wynik = null;
	private BigDecimal x = null;

	/**
	 * @param x
	 */
	public Wzor(BigDecimal x) {
		super();
		this.x = x;
		
		wynik = (this.x.multiply(new BigDecimal(2)).subtract(new BigDecimal(
				Math.tan(this.x.doubleValue()))));
		
		System.out.println(wynik);
	}

	/**
	 * @param wynik
	 * @param x
	 * @return
	 */
}
