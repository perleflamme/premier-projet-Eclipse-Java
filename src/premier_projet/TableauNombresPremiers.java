package premier_projet;

public class TableauNombresPremiers {

	public static void main(String[] args) {
		int[] nombresPremiers = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		System.out.println(nombresPremiers.length); // Affiche le nombre de caracteres de la ligne nombresPremiers = 10

		// Boucle for,permettant d'afficher elements strictements inférieurs au tableau
		for (int i = 0; i < nombresPremiers.length; i++) {
			System.out.println(nombresPremiers[i]);

			int[] nombresPremiers1 = { 2, 3, 5, 7, 11 };
			System.out.println(nombresPremiers1.length); // 5

			for (int i1 = 0; i < nombresPremiers1.length; i++) {
				System.out.println("A l'indice " + i + " : " + nombresPremiers1[i]);
			}

			String[] parking = { "V1", "V2", "V3", "V4", "V5" };
			for (int i1 = 0; i < parking.length; i++) {
				System.out.println(parking[i]);
			}

		}
	}

}
