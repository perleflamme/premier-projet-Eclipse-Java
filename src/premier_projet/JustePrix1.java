package premier_projet;

import java.util.Scanner;

public class JustePrix1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double prix = 120;
		System.out.println("Veuillez saisir un nombre");
		double prixChoisi = sc.nextDouble();

		if (prixChoisi > prix) {
			System.out.println("perdu, c'est moins");
		} else if (prixChoisi < prix) {
			System.out.println("perdu, c'est plus");
		} else {
			System.out.println("Gagné!!");
		}
	}

}
