import java.util.ArrayList;

public class Principale {
	public static void main(String[] args) {
		ArrayList<Persona> miaLista = new ArrayList<>();

		miaLista.add(new Persona("Roberto", "Barone", 20));
		miaLista.add(new Persona("Marco", "La Cascia", 712));

		System.out.println(miaLista.size());

		for (int i = 0; i < miaLista.size(); i++) {
			System.out.println(miaLista.get(i));
		}

		miaLista.clear();
		System.out.println(miaLista.size());
	}
}

class Persona {
        String nome;
        String cognome;
        int eta;

        public Persona() {}

        public Persona(String nome, String cognome, int eta) {
                this.nome = nome;
                this.cognome = cognome;
                this.eta = eta;
        }

        public String toString() {
                return String.format("%s %s, %s", nome, cognome, eta);
        }

        public boolean equals(Persona other) {
                return this.nome == other.nome &&
                        this.cognome == other.cognome &&
                        this.eta == eta;
        }
}
