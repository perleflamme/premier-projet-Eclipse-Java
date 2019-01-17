package premier_projet;

public class Conditions {

	public static void main(String[] args) {

		// if(conditions){
		// <Traitements>
		// }

		int note = 9;

		if (note >= 10) {
			System.out.println("Bravo, vous avez la moyenne");
		}

		if (note < 10) {
			System.out.println("Vous n'avez pas la moyenne");
			note = 10;
		}

		// == à utiliser en cas d'autre utilisation d un = dans les conditions
		if (note == 10) {

			System.out.println("Vous avez 10");
		}

		if (note != 12) {
			System.out.println("la note est # de 12");
		}
		System.out.println(note);
		System.out.println("Fin");

	}
}
