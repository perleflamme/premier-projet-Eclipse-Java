package premier_projet;

public class WhileBoucle {

	public static void main(String[] args) {

		// INFO
		//// cpt++ = cpt+1

		System.out.println("DEBUT");
		int i = 1;
		System.out.println("Avant i++ i = " + i);
		i++;
		System.out.println("Après le i++ i = " + i);
		i--;
		System.out.println("Après le i-- i = " + i);

		int cpt = 1;
		while (cpt < 10) {
			System.out.println("bonjour " + cpt);
			cpt++;// cpt = cpt + 1;
		}
		int cpt2 = 10;
		while (cpt2 >= 1) {
			System.out.println("ruojnob " + cpt2);
			cpt2--;// cpt2 = cpt2 -1;
		}
		int cpt3 = 0;
		while (cpt3 <= 3) {
			System.out.println("Hello " + cpt3);
			cpt3++;
		}

		int cpt4 = 0;
		while (cpt4 < 3) {
			System.out.println("Salut " + cpt4);
			cpt4++;
		}

		System.out.println("FIN");

	}

}
