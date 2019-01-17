package premier_projet;

public class ExoSTRING {

	public static void main(String[] args) {
		String chaine = "hello";
		String nom = "kitty";

		String chaineEtNom = chaine + nom;
		System.out.println(chaineEtNom);

		if (chaine.equals(nom)) {
			System.out.println("Les deux chaines sont identiques");
		}
		String chaineMaj = chaine.toUpperCase();
		System.out.println(chaineMaj);

		String nomMin = nom.toLowerCase();
		System.out.println(nomMin);

		System.out.println(nom);

		nom = "kitty";
		System.out.println(nom);

		if (!nom.contentEquals(chaine)) {
			System.out.println("cool");
		}
		chaine = "              bonjour                   ";
		System.out.println(chaine);
		String s = chaine.trim();
		System.out.println(s);

		// Comparaison
		// EQ
		// chaine1.equals(chaine2)
		// NOT EQ
		// !chaine1.equals(chaine2)
		// mettre en MAJ
		// chaine.toUpperCase()
		// chaine.toLowerCase
		// Supprimer les esopaces avant et après
		// chaine.trim()

		// si la chaine est egale
		if (chaine.contentEquals("bonjour")) {
			System.out.println("Salut");
		}

		// si la chaine commence par bon affichage salut
		if (chaine.startsWith("bon")) {
			System.out.println("Salut");
		}
		// si la chaine se termine par lo affichage p-e hello
		if (chaine.endsWith("lo")) {
			System.out.println("peut-être hello");
		}

		if (chaine.contains(" le ")) {
			System.out.println("Yes, la chaine contient ' le '");
		}
		// affiche le nombre de caractere de la chaine
		System.out.println(chaine.length());

		// attribue 0 au premier caractere et commence a partir de 3 inclus
		String sousChaineDe5JLaFin = chaine.substring(3);
		System.out.println(sousChaineDe5JLaFin);

		// attribue 0 au premier caractere et commence a 3 et s arrete a 7
		String sousChaineDe5J10 = chaine.substring(3, 7);
		System.out.println(sousChaineDe5J10);

		// equivaut à un +
		String t = chaine.concat("hello");

		//
		String chaine1 = "bon";
		String sousChaine = chaine.substring(10);

		// Remplace tout les bo par cool
		String chaine2 = chaine.replaceAll("bo", "cool");
		System.out.println(chaine2);

		// nomdechaine.equals(uneautrechaine)
		// nomdechaine.startsWith(debut)
		// nomdechaine.endsWith(fin)
		// nomdechaine.contains(mot)
		// nomdechaine.substring(3);
		// nomdechaine.substring(3, 7);
		// nomdechaine.concat("hello");
		// chaine.toUpperCase()
		// chaine.toLowerCase()
	}

}
