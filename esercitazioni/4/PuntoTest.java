import java.util.Scanner;

class PuntoTest {
	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);

		System.out.println("Primo punto");
		System.out.print("x > ");
		final double x1 = scanner.nextDouble();
		System.out.print("y > ");
		final double y1 = scanner.nextDouble();

		System.out.println("Secondo punto");
		System.out.print("x > ");
		final double x2 = scanner.nextDouble();
		System.out.print("y > ");
		final double y2 = scanner.nextDouble();

		final Punto punto1 = new Punto(x1, y1);
		final Punto punto2 = new Punto(x2, y2);

		final double distanza = Punto.distanza(punto1, punto2);
		System.out.println("Distanza = " + distanza);

		final Punto puntoMedio = Punto.medio(punto1, punto2);
		System.out.println("Punto Medio = " + puntoMedio.toString());

		final boolean equals = punto1.equals(punto2);
		if (equals) {
			System.out.println("Sono uguali");
		} else {
			System.out.println("Non sono uguali");
		}
	}
}

class Punto {
	final double x;
	final double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	
	public String toString() {
		return String.format("( %.2f, %.2f )", x, y);
	}

	boolean equals(Punto other) {
		return x == other.x && y == other.y;
	}

	public static double distanza(Punto a, Punto b) {
		return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
	}

	public static Punto medio(Punto a, Punto b) {
		final double x = (a.x + b.x) / 2;
		final double y = (a.y + b.y) / 2;

		return new Punto(x, y);
	}
}
