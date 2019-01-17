package premier_projet;

import java.util.Scanner;

public class MoyScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir Note_Java");
		int Note_Java = sc.nextInt();
		System.out.println("Saisir Note_Html");
		int Note_Html = sc.nextInt();
		System.out.println("Saisir Note_JavaScript");
		int Note_Javascript = sc.nextInt();
		System.out.println("Saisir Note_Sql");
		int Note_Sql = sc.nextInt();

		int somme_Matiere = 4;
		int somme_Note = (Note_Java + Note_Html + Note_Javascript + Note_Sql) / somme_Matiere;

		System.out.println(somme_Note);

	}

}
