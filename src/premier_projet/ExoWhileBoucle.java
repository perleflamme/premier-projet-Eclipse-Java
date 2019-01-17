package premier_projet;

public class ExoWhileBoucle {

	public static void main(String[] args) {

		int cpt = 1;
		while (cpt <= 100) {
			System.out.println("nombre" + cpt);
			cpt++;

		}

		int cpt1 = 50;
		while (cpt1 >= 10) {
			System.out.println("n°" + cpt1);
			cpt1--;
		}

		int cpt2 = 1;
		while (cpt2 <= 10) {
			if (cpt2 == 2) {
				System.out.println("Yay!");
			} else if (cpt2 == 4) {
				System.out.println("Yay!! Yay!!");
			} else if (cpt2 == 6) {
				System.out.println("Yay!!! Yay!!! Yay!!!");
			} else {
				System.out.println(cpt2);
			}
			cpt2++;
		}

		int cpt3 = 0;
		while (cpt3 <= 10) {
			if (cpt3 == 1) {
				System.out.println(" ");
			} else if (cpt3 == 3) {
				System.out.println(" ");
			} else if (cpt3 == 5) {
				System.out.println(" ");
			} else if (cpt3 == 7) {
				System.out.println(" ");
			} else if (cpt3 == 9)
				System.out.println(" ");
			else {
				System.out.println(cpt3);
			}
			cpt3++;
		}

		int cpt4 = 0;
		while (cpt4 <= 20) {
			if (cpt4 % 2 == 0) {
				System.out.println(cpt4);
			}
			cpt4++;
		}
		int cpt5 = 0;
		while (cpt5 <= 20) {
			if (cpt5 % 2 != 0) {
				System.out.println(cpt4);
			}
			cpt4++;
		}

		int compteur = 0;
		while (compteur <= 10) {
			if (compteur % 2 == 0) {
				System.out.println(compteur);
			}
			compteur++;
		}

		int cpt6 = 0;
		do {
			if (cpt5 % 2 == 0) {
				System.out.println(cpt5);
			}
			cpt5++;
		} while (cpt5 <= 20);

		int cpt7 = 13;
		do {
			if (cpt6 % 7 != 0) {
				System.out.println(cpt6 + " le cpt n'est pas multiple de 7");
			}
			cpt6++;
		} while (cpt6 <= 10);
		// le traitement est executé au moins une fois
		// affiche : 13 le cpt n'est pas multiple de 7
		// utilisé dans des cas particuliers

	}

}
