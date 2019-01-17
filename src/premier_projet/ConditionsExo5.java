package premier_projet;

public class ConditionsExo5 {

	public static void main(String[] args) {
		for (int i = 1; i <= 32; i++) {
			System.out.print("* ");
			if (i % 4 == 0) {
				System.out.println();
			}
		}
		System.out.println("FIN");
	}
}