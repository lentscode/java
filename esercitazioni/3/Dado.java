import java.lang.Math;

class Dado {
	public int lancia() {
		return (int)(Math.random() * 6 + 1);
	}
}

class TestDado {
	public static void main(String[] args) {
		final Dado dado1 = new Dado();
		final Dado dado2 = new Dado();

		for (int i = 0; i < 100; i++) {
			final int num1 = dado1.lancia();
			final int num2 = dado2.lancia();

			if (num1 + num2 == 12) {
				System.out.println("L'hai sfumazzata");
			}
		}
	}	
}
