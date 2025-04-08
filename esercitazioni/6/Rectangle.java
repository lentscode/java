public class Rectangle extends Shape {
	private double width;
	private double heigth;

	public Rectangle(
		String color,
		boolean filled,
		double width,
		double heigth
	) {
		super(color, filled);

		this.width = width;
		this.heigth = heigth;
	}

	protected double getWidth() {
		return width;
	}

	protected double getHeigth() {
		return heigth;
	}

	@Override public void scale(double factor) {
		width *= factor;
		heigth *= factor;
	}

	@Override public String toString() {
		return String.format(
			"Rectangle(%s, Width: %.2f, Heigth: %.2f)",
			super.toString(),
			width,
			heigth
		);
	}
}
