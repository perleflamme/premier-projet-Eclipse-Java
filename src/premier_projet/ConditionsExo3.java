package premier_projet;

public class ConditionsExo3 {

	public static void main(String[] args) {
		double noteJava = 20;
		double noteSql = 16;
		double noteHtml = 15.5;
		double noteJavascript = 19.5;

		int coefJava = 5;
		int coefSql = 2;
		int coefHtml = 1;
		int coefJavascript = 3;

		// Calculer la moyenne et l'affecter à une variable nommée "moyenne"
		int sommeCoef = coefJava + coefSql + coefHtml + coefJavascript;
		double resultatJava = noteJava * coefJava;
		double resultatHtml = noteHtml * coefHtml;
		double resultatJavascript = noteJavascript * coefJavascript;
		double resultatSql = noteSql * coefSql;
		double sommeResultat = resultatJava + resultatHtml + resultatJavascript + resultatSql;
		double moyenne = sommeResultat / sommeCoef;
		System.out.println(moyenne);
		// Ou
		System.out.println("La moyenne : " + moyenne);

		// Appreciation selon la moyenne

		if (moyenne >= 18 && moyenne <= 20) {
			System.out.println("TB");
		} else if (moyenne >= 15 && moyenne < 18) {
			System.out.println("B");
		} else if (moyenne >= 12 && moyenne < 15) {
			System.out.println("AB");
		} else if (moyenne >= 10 && moyenne < 12) {
			System.out.println("Moy");
		} else if (moyenne < 10 && moyenne >= 5) {
			System.out.println("rattr");
		} else if (moyenne < 5 && moyenne >= 0) {
			System.out.println("Nul");
		} else {
			System.out.println("error");
		}

///////////////////////////////////////////////////

		if (moyenne >= 8 && moyenne < 10) {
			System.out.println("Ra");
		} else if (moyenne >= 10 && moyenne <= 12) {
			System.out.println("Bien");
		} else if (moyenne > 12 && moyenne <= 15) {
			System.out.println("Ass Bien");
		} else if (moyenne > 15) {
			System.out.println("TB");
		} else {
			System.out.println("A l'année prochaine");
		}
////////////////////////////////////////////////////

		// Si la moyenne est inférieure à 10 et supérieure à 8, et que la note Java est
		// supérieure à 10
		// alors "conseil de classe".

		if (moyenne < 10 && moyenne >= 8 && noteJava >= 10)
			System.out.println("Conseil de classe");

		// Si la moyenne est inférieure à 10 mais supérieure ou égale à 8 et qu'une note
		// au dessus de 15 = passe

		if ((moyenne < 10 && moyenne >= 8) && (noteJava > 15 || noteHtml > 15 || noteSql > 15 || noteJavascript > 15))
			System.out.println("Passe");

		// OU en plus lisible

		boolean noteEntre8Et10 = (moyenne >= 8 && moyenne < 10);
		boolean uneDesNoteEstSupA15 = (noteJava > 15 || noteHtml > 15 || noteSql > 15 || noteJavascript > 15);
		if (noteEntre8Et10 && uneDesNoteEstSupA15) {
			System.out.println("Il passe");
		}

		boolean toutesNotesPlusDeQuinze = (noteJava > 15 && noteHtml > 15 && noteSql > 15 && noteJavascript > 15);
		if (moyenne >= 17 && toutesNotesPlusDeQuinze)
			System.out.println("Félicitations");

		//

	}
}
