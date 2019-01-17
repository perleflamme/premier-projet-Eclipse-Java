package premier_projet;

import java.util.Scanner;

public class ExoWEsolu2 {
//Demander à l'utilisateur de saisir le nombre1
//Demander à l'utilisateur de saisir le nombre2
//Demander à l'utilisateur de saisir le nombre3
//Afficher le nombre le plus petit

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double min = Float.MAX_VALUE;
		System.out.println("Veuillez choisir un nombre 1");
		double nombre1 = sc.nextFloat();

		if (nombre1 < min) {
			min = nombre1;
		}

		System.out.println("Veuillez choisir un nombre 2");
		double nombre2 = sc.nextFloat();
		if (nombre2 < min) {
			min = nombre2;
		}
		System.out.println("Veuillez choisir un nombre 3");
		double nombre3 = sc.nextFloat();

		if (nombre3 < min) {
			min = nombre3;
		}

		System.out.println(min + " est le nombre le plus petit ");
	}
}
