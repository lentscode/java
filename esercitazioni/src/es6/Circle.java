package es6;

public class Circle extends Shape {
	private double radius;

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);

		this.radius = radius;
	}

	@Override public void scale(double factor) {
		radius *= factor;
	}

	@Override public String toString() {
		return String.format("Circle(%s, Radius: %.2f)", super.toString(), radius);
	}
}
