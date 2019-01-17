package premier_projet;

import java.util.Scanner;

public class ExoScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre min :");
		int min = sc.nextInt();
		System.out.println("Veuillez saisir un nombre max");
		int max = sc.nextInt();

		while (min <= max) {
			if (min % 2 != 0) {
				System.out.println(min);
			}
			min++;
		}
	}
}