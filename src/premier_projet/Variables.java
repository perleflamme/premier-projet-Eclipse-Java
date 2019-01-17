package premier_projet;

public class Variables {

	public static void main(String[] args) {
		// <type_de_la_variable> <nom_de_la_variable> = <valeur>;

		// déclaration
		// <type_de_la_variable> <nom_de_la_variable>;

		// affectation
		// <nom_de_la_variable> = <valeur>;

		// déclaration
		String nom;

		// affectation
		nom = "Che";

		// déclaration + Affectation
		String prenom = "Mil";

		System.out.println(nom);
		System.out.println(prenom);

		// Afficher -> nom prenom
		System.out.println(nom + " " + prenom);
		System.out.println(nom + " " + prenom + ".");

		// String <nom.variable> = <valeur>;
		nom = "Chupacabra";
		System.out.println(nom);

		nom = "un autre nom";
		System.out.println(nom);

		short nombrePetit;
		nombrePetit = 12;
		// -32768 =>32768

		System.out.println(nombrePetit);
		System.out.println(nombrePetit + 14);

		int nombreGrand = 145;
		System.out.println(nombreGrand * 12);

		nombreGrand = 12548;
		System.out.println(nombreGrand / 2);
		// -2 147 483 648 => 2 147 483 648

		System.out.println(nombreGrand - 100000);

		long nombreTropGrand = 652198432;
		// -9 223 372 036 854 775 808 =>9 223 372 036 854 775 808
		System.out.println(nombreTropGrand + nombreGrand);

		long coordonneeSpace = 120_120_120_120L;
		System.out.println(coordonneeSpace);

		double tva = 20.0;
		System.out.println(tva * 20);

		float taxe = 33.5f;
		System.out.println(15 / taxe);

		int prix = 100;
		System.out.println(tva + " * " + prix + " = " + (tva * prix));

		System.out.println(tva / 0);

		short longueur = 10000;
		short largeur = 1000;
		System.out.println("l * L = " + (longueur * largeur));

		int entier1 = 10;
		int entier2 = 3;
		double d1 = 3;
		System.out.println(entier1 / entier2);
		System.out.println(entier1 / d1);
		float f1 = 3f;
		System.out.println(entier1 / f1);

		// affectation
		int somme = 1;
		somme = 2;
		System.out.println(somme);
		somme = 12 + 10;
		System.out.println(somme);

		somme = somme + 10;
		System.out.println(somme);

		somme = somme - 5;
		System.out.println(somme);

		// CHAR
		char c = 'f';

		boolean faux = false;
		boolean vrai = true;

		boolean b = (somme == 27);
		System.out.println(somme);
		System.out.println("la variable boolean b = " + b);

	}

}
