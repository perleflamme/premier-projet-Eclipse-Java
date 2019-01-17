package premier_projet;

import java.util.Scanner;

public class ExoRECTANGLE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int longueur = sc.nextInt();
		int largeur = sc.nextInt();
		int totalEtoiles = longueur * largeur;
		for (int i = 1; i <= totalEtoiles; i++) {
			System.out.print("¤ ");
			if (i % longueur == 0) {
				System.out.println();
			}
		}
	}
}