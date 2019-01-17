package premier_projet;

import java.util.Scanner;

public class ExoRechercheTableau {

	public static void main(String[] args) {

		// Afficher le message Laurent existe dans la liste si c'est le cas
		// ou afficher Laurent n'existe pas dans le tableau

		Scanner sc = new Scanner(System.in);
		String[] prenoms = { "Miloud", "Agnès", "Lionel", "Fabrice", "Charles", "Yassine", "Arnaud", "Mohamed",
				"Radouane", "Patrice", "Laurence", "Adrien", "Nedjma" };

		System.out.println("Veuillez saisir un  prénom svp:");
		String prenomRech = sc.nextLine();

		rechercherLeNomDansLeTableau(prenomRech, prenoms);

	}

	public static void rechercherLeNomDansLeTableau(String nom, String[] prenoms) {
		boolean existe = false;
		for (int i = 0; i < prenoms.length; i++) {
			if (prenoms[i].equals(nom)) {
				existe = true;
			}
		}
		if (existe == true) {
			System.out.println(nom + " existe dans la liste des prénoms");
		} else {
			System.out.println(nom + " n'existe pas dans la liste des prénoms");
		}
	}
}