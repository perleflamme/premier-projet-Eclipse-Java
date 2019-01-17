package premier_projet;

import java.util.Scanner;

public class ExoWEAffLeMAX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double max = Double.MIN_VALUE;
		System.out.println("Veuillez choisir un nombre 1");
		double nombre1 = sc.nextDouble();

		if (nombre1 > max) {
			max = nombre1;
		}

		System.out.println("Veuillez choisir un nombre 2");
		double nombre2 = sc.nextDouble();
		if (nombre2 > max) {
			max = nombre2;
		}
		System.out.println("Veuillez choisir un nombre 3");
		double nombre3 = sc.nextDouble();

		if (nombre3 > max) {
			max = nombre3;
		}

		System.out.println(max + " est le nombre le plus grand ");
	}
}
