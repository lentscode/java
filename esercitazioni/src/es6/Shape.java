package es6;

public abstract class Shape implements Drawable, Scalable {
	private String color;
	private boolean filled;

	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	protected String getColor() {
		return color;
	}

	protected boolean getFilled() {
		return filled;
	}
	
	public abstract void scale(double factor);
	
	public void draw() {
		System.out.println("Disegnata forma");
	}

	@Override public String toString() {
		return String.format("Color: %s, Filled: %s", color, filled);
	}
} 
