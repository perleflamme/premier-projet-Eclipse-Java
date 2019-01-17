package premier_projet;

public class ConditionSwitch {

	public static void main(String[] args) {
		int note = 10;
		switch (note) {
		case 10:
			System.out.println("Vous avez eu 10");
			break;
		case 15:
			System.out.println("15");
			break;
		case 14:
			System.out.println("14");
			break;
		case 12:
			System.out.println("12");
			break;
		default:
			System.out.println("aucune des valeurs");
			break;
		}

	}

}
