import java.util.Scanner;

class TestPoint {
	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		
		System.out.println("You have to prompt coords for two points");

		System.out.println("First point:");
		final Point point1 = pointFromPrompt(scanner);

		System.out.println("Second point:");
		final Point point2 = pointFromPrompt(scanner);

		System.out.print("Distance: ");
		System.out.println(point1.distance(point2));

		System.out.print("Mean Point: ");
		System.out.println(Point.mean(point1, point2).toString());

		System.out.print("Are equals: ");
		System.out.println(point1.equals(point2));
	}

	private static Point pointFromPrompt(Scanner scanner) {
		System.out.print("x coord > ");
		final double x = scanner.nextDouble();

		System.out.print("y coord > ");
		final double y = scanner.nextDouble();

		return new Point(x, y);
	}
}

public class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String toString() {
		return String.format("(%.2f, %.2f)", x, y);
	}

	public boolean equals(Point other) {
		return other.x == x && other.y == y;
	}

	public double distance(Point other) {
		final double deltaX = other.x - x;
		final double deltaY = other.y - y;

		return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
	}

	public static Point mean(Point a, Point b) {
		final double x = (a.x + b.x) / 2;
		final double y = (a.y + b.y) / 2;

		return new Point(x, y);
	}
}
