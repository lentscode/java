package es7;

public class PremiumSubscriber extends Subscriber {
	private double currentCumulative;

	public PremiumSubscriber(
		String firstName,
		String lastName,
		int age,
		double discount
	) {
		super(firstName, lastName, age, discount);

		currentCumulative = 0;
	}

	@Override public Product buyProduct(Product product) {
		Product productBought = product;

		if (product.getPrice() + currentCumulative > 100) {
			productBought = product.copyWithPrice(product.getPrice() - 5);
			currentCumulative = productBought.getPrice();
		}

		return super.buyProduct(productBought);
	}
}
