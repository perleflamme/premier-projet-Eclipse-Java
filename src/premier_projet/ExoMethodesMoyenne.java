package premier_projet;

public class ExoMethodesMoyenne {

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
		double moyenne = recupMoyenne(noteJava, noteSql, noteHtml, noteJavascript, coefJava, coefSql, coefHtml,
				coefJavascript);

		System.out.println("La moyenne : " + moyenne);
		afficherMention(moyenne);
	}

	// Appreciation selon la moyenne
	public static void afficherMention(double moyenne) {
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

	}

	public static double recupMoyenne(double noteJava, double noteHtml, double noteJavascript, double noteSql,
			int coefJava, int coefHtml, int coefJavascript, int coefSql) {
		int sommeCoef = coefJava + coefSql + coefHtml + coefJavascript;
		double resultatJava = noteJava * coefJava;
		double resultatHtml = noteHtml * coefHtml;
		double resultatJavascript = noteJavascript * coefJavascript;
		double resultatSql = noteSql * coefSql;
		double sommeResultat = resultatJava + resultatHtml + resultatJavascript + resultatSql;
		double moyenne = sommeResultat / sommeCoef;
		return moyenne;
	}
}
