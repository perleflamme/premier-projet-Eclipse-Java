package premier_projet;

public class ExoSommeNombresPremiers {

	public static void main(String[] args) {
		int[] nombresPremiers = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79,
				83, 89, 97 };
		int somme = 0;
		for (int i = 0; i < nombresPremiers.length; i++) {
			somme = somme + nombresPremiers[i];
		}
		System.out.println("la somme des nombres premiers entre 0 et 100 : " + somme);
		// Affiche la somme des nombres premiers
		System.out.println(somme);
		// Affiche la somme des nombres premiers MOINS le 12eme (-41)
		System.out.println(somme - nombresPremiers[12]);
	}

}
