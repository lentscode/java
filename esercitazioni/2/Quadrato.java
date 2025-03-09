class Quadrato {
	private int lato;

	public Quadrato(int lato) {
		this.lato = lato;
	}

	public int perimetro() {
		return 4 * lato;
	}

	public int area() {
		return lato ^ 2;
	}
}

class TestQuadrato {
	public static void main(String[] args) {
		final Quadrato quadrato = new Quadrato(5);

		System.out.println(String.format("Perimetro: %d", quadrato.perimetro()));
		System.out.println(String.format("Area: %d", quadrato.area()));
	}
}
