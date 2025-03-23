import java.util.Scanner;
import java.util.ArrayList;
import java.util.Optional;

class Menu {
	static ArrayList<Persona> persone = new ArrayList<Persona>();
	
	public static void main(String[] args) {
		int choice = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Scegli una delle seguenti opzioni\n");

			System.out.println("1. Inserisci una persona");
			System.out.println("2. Cerca una persona per nome");
			System.out.println("3. Stampa la lista");
			System.out.println("4. Cancella la lista");
			System.out.println("0. Esci");

			System.out.print("Scelta > ");
			choice = scanner.nextInt();

			scanner.nextLine();

			switch (choice) {
				case 1: 
					final Persona nuovaPersona = ottieniPersona(scanner);
					aggiungiPersona(nuovaPersona);
					System.out.println("Aggiunta " + nuovaPersona.toString());
					break;
				case 2:
					final String nome = ottieniNomePersona(scanner);
					final Optional<Persona> persona = cercaPersona(nome);

					persona.ifPresentOrElse(
						personaTrovata -> System.out.println(personaTrovata.toString()),
						() -> System.out.println("Persona non trovata")
					);
					break;
				case 3:
					stampaLista();
					break;
				case 4:
					cancellaLista();
					System.out.println("Lista cancellata");
					break;
			}

			if (choice < 0) {
				System.out.println("Scelta non valida, riprova.");
			}
		} while (choice != 0);
	}

	private static Persona ottieniPersona(Scanner scanner) {
		Persona persona = new Persona();

		System.out.print("Nome > ");
		persona.nome = scanner.nextLine();

		System.out.print("Cognome > ");
		persona.cognome = scanner.nextLine();

		System.out.print("Eta > ");
		persona.eta = scanner.nextInt();

		scanner.nextLine();

		return persona;
	}

	private static String ottieniNomePersona(Scanner scanner) {
		System.out.print("Nome > ");
		return scanner.nextLine();
	}

	private static void aggiungiPersona(Persona persona) {
		persone.add(persona);
	}

	private static Optional<Persona> cercaPersona(String nome) {
		for (Persona persona : persone) {
			if (persona.nome.equals(nome)) {
				return Optional.of(persona);
			}
		}

		return Optional.empty();
	}	

	private static void stampaLista() {
		System.out.println("[");

		for (Persona persona : persone) {
			System.out.println(persona.toString());
		}

		System.out.println("]");
	}
	
	private static void cancellaLista() {
		persone.clear();
	}
}
