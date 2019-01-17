package premier_projet;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class JustePrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int prix = ThreadLocalRandom.current().nextInt(0, 1000);
		// System.out.println(prix); sert à voir le prix aléatoire dans la console.
		System.out.println(prix);
		//
		int prixChoisi = 0;

		do {
			System.out.println("Veuillez saisir un nombre");
			prixChoisi = sc.nextInt();

			if (prixChoisi > prix) {
				System.out.println("perdu, c'est moins");
			} else if (prixChoisi < prix) {
				System.out.println("perdu, c'est plus");
			} else {
				System.out.println("Gagné!!");
			}
		} while (prixChoisi != prix);
		System.out.println("FIN");

	}
}