package premier_projet;

import java.util.Scanner; //2

public class LectureClavier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 1
		String ligne = sc.nextLine();
		System.out.println("Vous avez saisi : " + ligne);
		System.out.println("Veuillez saisir un nombre entier : ");
		int nombre = sc.nextInt();
		if (nombre == 10) {
			System.out.println("Vous avez Saisi 10");
		} else {
			System.out.println("le nombre que vous avez saisi : ");
		}
	}

}
