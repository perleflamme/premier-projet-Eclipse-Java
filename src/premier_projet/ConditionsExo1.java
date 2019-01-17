package premier_projet;

public class ConditionsExo1 {

	public static void main(String[] args) {

		// >=18 Maj
		// <18 Min

		int age = 18;

		if (age >= 18) {
			System.out.println("Vous êtes majeur");
		}

		if (age < 18) {
			System.out.println("Vous êtes mineur");
		}

		// && = AND // || = OR

		double note = 20;

		if (note >= 18) {
			System.out.println("TB");
		}
		if (note >= 15 && note < 18) {
			System.out.println("B");
		}
		if (note >= 12 && note < 15) {
			System.out.println("AB");
		}
		if (note >= 10 && note < 12) {
			System.out.println("M");
		}
		if (note >= 5 && note < 10) {
			System.out.println("PMF");
		}
		if (note >= 0 && note < 5) {
			System.out.println("Nul");
		}
		if (note < 0 || note > 20) {
			System.out.println("Error");
		}

		// If + Else = If optimisé. vous êtes majeur sans scanner le vous êtes mineur.
		if (age >= 18) {
			System.out.println("Vous êtes majeur");
		} else {
			System.out.println("Vous êtes mineur");
		}

		if (note >= 0 && note <= 5) {
			System.out.println("Nul");
		} else if (note >= 5 && note < 10) {
			System.out.println("PMF");
		} else if (note >= 10 && note < 12) {
			System.out.println("M");
		} else if (note >= 12 && note < 15) {
			System.out.println("AB");
		} else if (note >= 15 && note < 18) {
			System.out.println("B");
		} else if (note >= 18 && note <= 20) {
			System.out.println("TB");
		} else if (note > 20 || note < 0) {
			System.out.println("ERROR");
		}

	}
}
