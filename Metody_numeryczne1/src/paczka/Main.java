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
	public static boolean quiet;

	static void drukujMenu() {
		System.out.println("Wybierz opcje");
		System.out.println("1 - drukuj ponownie menu");
		System.out.println("2 - oblicz równanie metodą połowienia przedzałów");
		System.out.println("6 - zakończ");
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		for (String string : args) {
			if (string.equals("-q") || string.equals("--quiet")) {
				quiet = true;
			}
		}
		boolean menu = false;
		int option = 1;
		BufferedReader klaw = new BufferedReader(new InputStreamReader(
				System.in));
		do {
			drukujMenu();
			option = Integer.parseInt(klaw.readLine());

			if (quiet) {
				System.out.println(option);
			}
			switch (option) {
			case 1:
				drukujMenu();
				break;
			case 2:
				System.out.println("pomidorek");
				break;
			case 6:
				menu = true;
				break;
			}

		} while (!menu);

	}
}
