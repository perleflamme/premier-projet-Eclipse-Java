package premier_projet;

import java.util.Scanner;

public class Maths1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez saisir la longueur de votre rectangle");

		float Longueur = sc.nextFloat();

		System.out.println("Veuillez saisir la largeur de votre rectangle");

		float Largeur = sc.nextFloat();

		float airedurectangle = (Largeur * Longueur);

		System.out.println("l'aire du rectangle =" + airedurectangle + "m²");

	}

}
