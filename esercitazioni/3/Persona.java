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

class Principale {
	public static void main(String[] args) {
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		
		persona1.nome = "Antonio";
		persona1.cognome = "Lentini";
		persona1.eta = 20;

		persona2.nome = "Mario";
		persona2.cognome = "Rossi";
		persona2.eta = 22;

		Persona persona3 = persona2;

		System.out.println(persona3.equals(persona2));
		persona3.nome = "Francesco";

		System.out.println(persona3.nome);
		System.out.println(persona2.nome);
	}
}
