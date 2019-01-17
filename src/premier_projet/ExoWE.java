package premier_projet;

import java.util.Scanner;

public class ExoWE {
//Demander à l'utilisateur de saisir le nombre1
//Demander à l'utilisateur de saisir le nombre2
//Demander à l'utilisateur de saisir le nombre3
//Afficher le nombre le plus petit

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez choisir un nombre 1");
		float nombre1 = sc.nextFloat();
		System.out.println("Veuillez choisir un nombre 2");
		float nombre2 = sc.nextFloat();
		System.out.println("Veuillez choisir un nombre 3");
		float nombre3 = sc.nextFloat();

		if (nombre1 < nombre2 && nombre1 < nombre3) {
			System.out.println(nombre1 + " est le chiffre le plus petit");
		} else if (nombre2 < nombre1 && nombre2 < nombre3) {
			System.out.println(nombre2 + " est le chiffre le plus petit");
		} else {
			System.out.println(nombre3 + " est le chiffre le plus petit");
		}

	}

}