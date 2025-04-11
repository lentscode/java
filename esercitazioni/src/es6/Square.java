package es6;

public class Square extends Rectangle {
	public Square(String color, boolean filled, double side) {
		super(color, filled, side, side);
	}

	@Override public String toString() {
		return String.format(
			"Square(Color: %s, Filled: %s, Side: %.2f)",
			super.getColor(),
			super.getFilled(),
			super.getWidth()
		);
	}
}
