package premier_projet;

public class ConditionsExo4 {

	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			System.out.print("* ");
			if (i % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println("FIN");
	}
}