package paczka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Napisać program realizujący różne metody znajdowania przybliżonego rozwiązania równania 2x-tanx = 0 (Chodzi o rozwiązanie x!=0)
 * Należy rozważać następujące algorytmy:
 * 1) metodę prostych iteracji
 * 2) metodę Newtona
 * 3) metodę siecznych
 * 4) metodę Newtona ze stałą pochodną
 * 5) metoda połowienia przedziałów 
 */

public class Main {
	public static boolean loud = true;

	static void drukujMenu() {
		System.out.println("Wybierz opcje");
		System.out.println("1 - drukuj ponownie menu");
		System.out.println("2 - oblicz równanie metodą połowienia przedzałów");
		System.out.println("6 - zakończ");
	}

	static double[] pobierzWarunki() throws NumberFormatException, IOException {
		double[] warunki = new double[3];
		warunki[0] = 4;// TODO potem zmienic -2 na 4
		warunki[1] = 2;
		BufferedReader klawa = new BufferedReader(new InputStreamReader(
				System.in));
		while (warunki[0] >= warunki[1]) {
			System.out.println("Podaj początek przedziału:");
			warunki[0] = Double.parseDouble((klawa.readLine()));
			System.out.println("Podaj koniec przedziału: ");
			warunki[1] = Double.parseDouble((klawa.readLine()));
			System.out.println("Podaj precyzje zaookrąglenia: ");
			warunki[2] = Double.parseDouble((klawa.readLine()));
			if (warunki[0] >= warunki[1]) {
				System.out.println("Błąd");
			}
		}
		return warunki;
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		for (String string : args) {
			if (string.equals("-l") || string.equals("--loud")) {
				loud = false;
			}
		}
		boolean menu = false;
		int option = 1;
		double[] warunki = new double[3];
		BufferedReader klaw = new BufferedReader(new InputStreamReader(
				System.in));
		do {
			drukujMenu();
			option = Integer.parseInt(klaw.readLine());

			if (!loud) {
				System.out.println("option =" + option);
			}
			switch (option) {
			case 1:
				drukujMenu();
				break;
			case 2:
				warunki = pobierzWarunki();
				PoloweniePrzedzialow polo = new PoloweniePrzedzialow(
						warunki[0], warunki[1], warunki[2], loud);
				System.out.println(polo.wynik);
				break;
			case 6:
				menu = true;
				break;
			}

		} while (!menu);

	}
}
