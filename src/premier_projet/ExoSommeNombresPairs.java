package premier_projet;

import java.util.Scanner;

public class ExoSommeNombresPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Saisir un nombre: ");
		double nb1 = sc.nextInt();
		System.out.println("Saisir un second nombre: ");
		double nb2 = sc.nextInt();

		double somme = 0;
		for (double i = nb1; i <= nb2; i++) {
			if (i % 2 == 0) {
				somme = somme + i;

				System.out.println(somme);
			}
		}
	}

	public static double sommeDesPaires(double nb1, double nb2) {
		double somme = 0;
		for (double i = nb1; i <= nb2; i++) {
			if (i % 2 == 0) {
				somme = somme + i;
			}

		}
		return somme;
	}
}
