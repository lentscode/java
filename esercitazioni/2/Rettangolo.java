class Rettangolo {
	private int b;
	private int h;

	public Rettangolo(int b, int h) {
		this.b = b;
		this.h = h;
	}

	public int perimetro() {
		return 2 * (b + h);
	}

	public int area() {
		return b * h;
	}

	public double diagonale() {
		return Math.sqrt(b * b + h * h);
	}
}

class TestRettangolo {
	public static void main(String[] args) {
		final Rettangolo r1 = new Rettangolo(8, 7);
		final Rettangolo r2 = new Rettangolo(3, 9);

		System.out.println(String.format("Perimetro 1 = %d", r1.perimetro()));
		System.out.println(String.format("Perimetro 2 = %d", r2.perimetro()));

		System.out.println(String.format("Area 1 = %d", r1.area()));
		System.out.println(String.format("Area 2 = %d", r2.area()));

		System.out.println(String.format("Diagonale 1 = %.2f", r1.diagonale()));
		System.out.println(String.format("Diagonale 2 = %.2f", r2.diagonale()));
	}
}
