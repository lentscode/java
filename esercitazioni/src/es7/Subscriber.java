package es7;

import java.util.ArrayList;
import es5.Person;

public class Subscriber extends Person {
	private double discount;
	private ArrayList<Product> productsBought;

	public Subscriber(
		String firstName,
		String lastName,
		int age,
		double discount
	) {
		super(firstName, lastName, age);

		this.discount = discount;
		this.productsBought = new ArrayList<Product>();
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		if (discount < 0) return;

		this.discount = discount;
	}

	public Product buyProduct(Product product) {
		final Product productBought = product.copyWithPrice(product.getPrice() * (1 - discount / 100));

		this.productsBought.add(productBought);

		return productBought;
	}

	public ArrayList<Product> getProducts() {
		return productsBought;
	}
}
