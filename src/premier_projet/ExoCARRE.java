package premier_projet;

import java.util.Scanner;

public class ExoCARRE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cote = sc.nextInt();
		for (int i = 1; i <= cote * cote; i++) {
			System.out.print("¤ ");
			if (i % cote == 0) {
				System.out.println();
			}
		}
		System.out.println("FIN");
	}
}
