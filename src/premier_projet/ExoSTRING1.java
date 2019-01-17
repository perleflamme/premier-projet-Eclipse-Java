package premier_projet;

import java.util.Scanner;

public class ExoSTRING1 {

	public static void main(String[] args) {
		// Demander une adresse mail qui se termine par @gmail
		// et qui contient au moins 15 caractéres.

		Scanner sc = new Scanner(System.in);
		String email = "";
		do {
			System.out.println("Veuillez saisir une adresse GMAIL : ");
			email = sc.nextLine();
		} while (!email.endsWith("@gmail.com") || email.length() < 15);
		System.out.println("Merci");

	}
}