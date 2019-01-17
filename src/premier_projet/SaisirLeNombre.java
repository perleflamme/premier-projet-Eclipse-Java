package premier_projet;

import java.util.Scanner;

public class SaisirLeNombre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nombre = 0;
		do {
			System.out.println("Veuillez saisir le nombre 0 ");
			nombre = sc.nextInt();
		} while (nombre != 0);

		System.out.println("Vous avez saisi 0");
		System.out.println("FIN");
	}

}
