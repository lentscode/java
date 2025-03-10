
class NumeriPrimi {
	public static void main(String[] args) {
		int[] numeriPrimi = new int[50];
		int currentIndex = 0;

		for (int i = 2; i < 100; i++) {
			boolean prime = true;
			for (int j = 0; j < currentIndex; j++) {
				if (i % numeriPrimi[j] == 0 ) {
					prime = false;
					break;
				}
			}

			if (prime) {
				numeriPrimi[currentIndex++] = i;
				System.out.println(String.format("Numero primo Nº%d: %d", currentIndex, i));
			}
		}
	}
}
