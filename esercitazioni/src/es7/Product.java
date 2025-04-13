package es7;

public class Product {
	private final String name;
	private final double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price >= 0 ? price : 0;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public Product copyWithPrice(double price) {
		return new Product(name, price);
	}
}
