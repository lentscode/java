package es10;

class StringAnalyzerTest {
	public static void main(String[] args) {
		final StringAnalyzer sa = new StringAnalyzer("Scrivete un programma che, utilizzando il metodo split su una stringa contenente il testo di questo esercizio, determina il numero totale di parole presenti nel testo e la parola che compare con maggiore frequenza. Potreste anche pensare di utilizzare una HashMap<String, Integer> per memorizzare la frequenza di ciascuna parola utilizzando la parola stessa come chiave. Stampate, infine, la frequenza diciascuna parola (è sufficiente stampare l’intera HashMap). Per inserire una coppia chiave,valore nella mappa potete usare il metodo put(K key, V value) mentre per leggere il valore corrispondente a una chiave il metodo V get(Object key).");

		System.out.println(sa.toString().replaceAll(", ", ",\n"));
	}
}
