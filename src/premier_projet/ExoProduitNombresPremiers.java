package premier_projet;

public class ExoProduitNombresPremiers {

	public static void main(String[] args) {
		double[] nombresPremiers = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79,
				83, 89, 97 };
		// Element neutre de la multiplication = 1
		double produit = 1;
		for (int i = 0; i < nombresPremiers.length; i++) {
			produit = produit * nombresPremiers[i];
		}
		System.out.println("Le produit des nombres entiers entre 0 et 100 : " + produit);

		System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");

		// Produit des Nombres premiers multiples de 5
		double[] nombresPremiers1 = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73,
				79, 83, 89, 97 };
		double produit1 = 1;
		for (int i = 0; i < nombresPremiers1.length; i++) {
			if (nombresPremiers1[i] % 5 == 0) {
				produit1 = produit1 * nombresPremiers1[i];

			}
		}
		System.out.println("Le produit des nombres entiers multiples de 5 : " + produit1);

		System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");

		// Produit de tt les nombres premier qui deviennent multiple de 5 en ajoutant 1
		int[] nombresPremiers2 = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79,
				83, 89, 97 };

		double produit2 = 1;

		for (int i = 0; i < nombresPremiers2.length; i++) {
			int valPlus1 = nombresPremiers2[i] + 1;
			if (valPlus1 % 5 == 0) {
				produit2 = (produit2 * nombresPremiers2[i]);

			}

		}
		System.out.println(produit2);

	}
}
