package premier_projet;

public class SwitchExo1 {

	public static void main(String[] args) {

		int mois = 11;
		switch (mois) {
		case 1:
			System.out.println("Janvier");
			break;
		case 2:
			System.out.println("fevrier");
			break;
		case 3:
			System.out.println("Mars");
			break;
		case 4:
			System.out.println("Avril");
			break;
		case 5:
			System.out.println("Mai");
			break;
		case 6:
			System.out.println("Juin");
			break;
		case 7:
			System.out.println("Juillet");
			break;
		case 8:
			System.out.println("Aout");
			break;
		case 9:
			System.out.println("Septembre");
			break;
		case 10:
			System.out.println("Octobre");
			break;
		case 11:
			System.out.println("Novembre");
			break;
		case 12:
			System.out.println("Décembre");
			break;
		default:
			System.out.println("NULL");
			break;

		}
		String NomMois = "Novembre";
		switch (NomMois) {
		case "Janvier":
			System.out.println("1");
			break;
		case "février":
			System.out.println("2");
			break;
		case "Mars":
			System.out.println("3");
			break;
		case "Avril":
			System.out.println("4");
			break;
		case "Mai":
			System.out.println("5");
			break;
		case "Juin":
			System.out.println("6");
			break;
		case "Juillet":
			System.out.println("7");
			break;
		case "Aout":
			System.out.println("8");
			break;
		case "Septembre":
			System.out.println("9");
			break;
		case "Octobre":
			System.out.println("10");
			break;
		case "Novembre":
			System.out.println("11");
			break;
		case "Décembre":
			System.out.println("12");
			break;

		default:
			System.out.println("NULL");
			break;
		}

	}
}