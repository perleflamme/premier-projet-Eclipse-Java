package premier_projet;

public class FonctionsBase2 {

	public static void main(String[] args) {
		System.out.println("DEBUT");
		int d = doubleNombre(5);
		System.out.println(d);

		int unAutreDouble = doubleNombre(100);
		System.out.println(unAutreDouble);

		int add = addition(120, 14);
		System.out.println(add);

		int add2 = addition(15, 13);
		System.out.println(add2);
		System.out.println("FIN");
	}

	public static int doubleNombre(int entier) {
		System.out.println("DEBUT doubleNombre");
		int resultat = entier * 2;
		return resultat;
	}

	public static int addition(int entier1, int entier2) {
		System.out.println("DEBUT addition");
		int resultat = entier1 + entier2;
		return resultat;
	}

	public static double pi() {
		double nombrePi = 3.1416;
		return nombrePi;
	}

}
