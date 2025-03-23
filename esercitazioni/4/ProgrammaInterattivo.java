import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class ProgrammaInterattivo {
	static final ArrayList<String> paroleVietate = new ArrayList<String>(
		Arrays.asList(
		"alfa",
		"beta",
		"gamma",
		"delta",
		"epsilon",
		"kappa",
		"lambda",
		"sigma",
		"omega")
		);

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);

		String stringa = "";
		System.out.println("Digita qualcosa e batti enter oppure scrivi \"fine\" per terminare il programma");

		while(!(stringa = scanner.next()).equals("fine")) {
			if (paroleVietate.contains(stringa.toLowerCase())) {	
				System.out.println("Parola vietata");
				continue;
			}
			System.out.println("Hai digitato " + stringa.toUpperCase() + "!");
		}

		System.out.println("Fine programma!");
	}
}

