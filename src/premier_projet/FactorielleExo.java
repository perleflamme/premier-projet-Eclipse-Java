package premier_projet;

import java.util.Scanner;

public class FactorielleExo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre");
		int nombre = sc.nextInt();
		int produit = factorielle(nombre);
		System.out.println("Factorielle :  " + produit);
	}

	public static int factorielle(int nombre) {
		int produit = 1;
		for (int i = nombre; i > 0; i--) {
			produit = produit * i;
		}
		return produit;

	}
}
