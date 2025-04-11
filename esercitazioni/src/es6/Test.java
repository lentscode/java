package es6;

class Test {
	public static void main(String[] args) {
		final Square square = new Square("red", true, 2);

		System.out.println(square.toString());

		square.scale(2);
		System.out.println(square.toString());
	}
}
