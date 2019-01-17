package premier_projet;

public class ConditionsExo2 {

	public static void main(String[] args) {

		// Si prix choisi = prix
		// message: bravo
		// si prix choisi supérieur
		// message: perdu c'est moins
		// si prix choisi inférieur
		// message: perdu c'est plus

		double prix = 120;

		double prixchoisi = 130;

		if (prixchoisi > 120) {
			System.out.println("Perdu c'est moins!");
		} else if (prixchoisi < prix) {
			System.out.println("Perdu c'est plus");
		} else if (prixchoisi == prix) {
			// else{ fonctionne aussi pour la ligne du dessus
			System.out.println("Gagné, bravo");
		}

	}

}
