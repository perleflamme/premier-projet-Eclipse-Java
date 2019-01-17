package premier_projet;

import java.util.Scanner;

public class ExoCalculatrice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez saisir un nombre 1: ");
		// lecture clavier et affectation de la valeur à la variable nombre1
		double nombre1 = sc.nextInt();
		System.out.println("Veuillez choisir l'opération: ");
		// lecture clavier et affectation de la valeur à la variable operation
		String operation = sc.next();

		System.out.println("Veuillez saisir un nombre 2: ");
		double nombre2 = sc.nextInt();
		// lecture clavier et affectation de la valeur à la variable nombre

		double resultat = 0;
		if (operation.equals("+")) {
			resultat = addition(nombre1, nombre2);
		} else if (operation.equals("-")) {
			resultat = soustraction(nombre1, nombre2);
			resultat = nombre1 - nombre2;
		} else if (operation.equals("*")) {
			resultat = multiplication(nombre1, nombre2);
			resultat = nombre1 * nombre2;
		} else if (operation.equals("/")) {
			resultat = division(nombre1, nombre2);
			resultat = nombre1 / nombre2;
		} else if (operation.equals("%")) {
			resultat = modulo(nombre1, nombre2);
			resultat = nombre1 % nombre2;
		}

		System.out.println("résultat: " + nombre1 + " " + operation + " " + nombre2 + " = " + resultat);
	}

	public static double addition(double nb1, double nb2) {
		double resultat = nb1 + nb2;
		return resultat;
	}

	public static double soustraction(double nb1, double nb2) {
		double resultat = nb1 - nb2;
		return resultat;
	}

	public static double multiplication(double nb1, double nb2) {
		double resultat = nb1 * nb2;
		return resultat;
	}

	public static double division(double nb1, double nb2) {
		double resultat = nb1 / nb2;
		return resultat;
	}

	public static double modulo(double nb1, double nb2) {
		double resultat = nb1 % nb2;
		return resultat;
	}
}
