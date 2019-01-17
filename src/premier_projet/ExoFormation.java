package premier_projet;

public class ExoFormation {

	public static void main(String[] args) {
		String[] prenoms = {

				"Miloud", "Agnès", "Lionel", "Fabrice", "Charles", "Yassine", "Arnaud", "Mohamed", "Radouane",
				"Patrice", "Laurence", "Adrien", "Nedjma" };
		// Afficher tout les prénoms
		for (int i = 0; i < prenoms.length; i++) {
			System.out.println(prenoms[i]);
		}
		System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");
		// Afficher le message
		// Laurent existe dans la liste
		// Si c'est le cas

		// 1. parcourir mon tableau
		// 2. si une des valeurs = 'laurent'
		// Afficher => Laurent existe dans al liste

		for (int i = 0; i < prenoms.length; i++) {
			if (prenoms[i].contentEquals("Laurence")) {
				System.out.println("Laurence existe dans le tableau");
			}
		}
		System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");

		for (int i = 0; i < prenoms.length; i++) {
			if (prenoms[i].startsWith("L")) {
				System.out.println(prenoms[i]);
			}
		} // FIN BOUCLE
		System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");

		// Afficher les prénoms qui terminent par e
		for (int i = 0; i < prenoms.length; i++) {
			if (prenoms[i].endsWith("e")) {
				System.out.println(prenoms[i]);
			}
		} // FIN BOUCLE
		System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");

		// Afficher les prénoms qui ne contiennent pas la lettre a
		for (int i = 0; i < prenoms.length; i++) {
			if (!prenoms[i].contains("a")) {
				if (!prenoms[i].contains("A"))
					System.out.println(prenoms[i]);

			}
		} // FIN BOUCLE

		// Afficher prénoms sans la lettre a , autre méthode en minusculant les lettres
		System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");
		for (int i = 0; i < prenoms.length; i++) {
			String nomM = prenoms[i].toLowerCase();
			if (!nomM.contains("a")) {
				System.out.println(prenoms[i]);
			}

		} // FIN BOUCLE

		// Afficher tout les prenoms terminé par la lettre e , et afficher uniquement
		// les 3 premieres lettres
		System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");
		for (int i = 0; i < prenoms.length; i++) {
			if (prenoms[i].endsWith("e")) {
				System.out.println(prenoms[i].substring(0, 3));

			}

		} // FIN BOUCLE

		// Afficher les 4 dernieres lettres des prenoms peu importe leur taille
		System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");
		for (int i = 0; i < prenoms.length; i++) {
			int tailleChaine = prenoms[i].length();
			if (prenoms[i].endsWith("e")) {
				System.out.println(prenoms[i].substring(tailleChaine - 4));
			}
		}

	}
}
