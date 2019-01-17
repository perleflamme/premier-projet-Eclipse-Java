package premier_projet;

public class Tableaux {

	public static void main(String[] args) {
		int nombreEntier = 10;
		double nombreD = 12.5;

		String garage1 = "voiture 1";
		String garage2 = "voiture 2";
		String garage3 = "voiture 3";
		String[] parking = { "voiture 1", "voiture 2", "voiture 3" };
		// les [ ] indiquent l'emplacement cible
		// Les Chaines de caractéres ou les chiffres commencent à ZERO, puis , 1, 2 , 3
		System.out.println(parking[0]); // 0 = 1er élément
		System.out.println(parking[1]); // 1 = 2nd
		System.out.println(parking[2]); // 2 = 3eme

		String miloud = "Miloud";
		String agnes = "Agnès";
		String lionel = "Lionel";

		System.out.println(miloud);
		String[] prenoms = { "Miloud", "Agnès", "Lionel" };

		System.out.println(prenoms[2] + " , " + prenoms[0] + " , " + prenoms[1]);

		double[] notes = { 12.5, 12.5, 10.6, 15, 20 };
		int[] coefs = { 1, 5, 6, 7, 3, 2, 1 };

		System.out.println("Le Coef à l'indice 0 est : " + coefs[0]);
		System.out.println("La Note  l'indice 4 est : " + notes[2]);

		String chaine = "hello";
		System.out.println("Taille de la chaine : " + chaine.length()); // taille de la chaine prenthèses

		System.out.println("Taille du tableau notes : " + notes.length); // Taille du Tableau pas de parenthèses
		System.out.println("Taille du tableau coefs : " + coefs.length);
		System.out.println("FIN");
	}

}
