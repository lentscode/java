package es8;

public abstract class Vehicle {
	private final double iX;
	private final double iY;
	private final double iXSpeed;
	private final double iYSpeed;
	private final double xAcc;
	private final double yAcc;

	protected Vehicle(Builder<?> builder) {
		iX = builder.iX;
		iY = builder.iY;
		iXSpeed = builder.iXSpeed;
		iYSpeed = builder.iYSpeed;
		xAcc = builder.xAcc;
		yAcc = builder.yAcc;
	}

	public void move(double t) {
		final double x = iX + iXSpeed * t + xAcc * t * t / 2;
		final double y = iY + iYSpeed * t + yAcc * t * t / 2;

		final String output = String.format(
			"Time: %.2f, Position: (%.2f, %.2f)",
			t,
			x,
			y
		);

		System.out.println(output);
	}

	public double initialX() {
		return iX;
	}

	public double initialY() {
		return iY;
	}

	public double initialXSpeed() {
		return iXSpeed;
	}

	public double initialYSpeed() {
		return iYSpeed;
	}

	public double xAcc() {
		return xAcc;
	}

	public double yAcc() {
		return yAcc;
	}

	public static abstract class Builder<T extends Builder<T>> {	
		private double iX;
		private double iY;
		private double iXSpeed;
		private double iYSpeed;
		private double xAcc;
		private double yAcc;

		public T initialPosition(double x, double y) {
			iX = x;
			iY = y;

			return self();
		}

		public T initialSpeed(double xSpeed, double ySpeed) {
			iXSpeed = xSpeed;
			iYSpeed = ySpeed;

			return self();
		}

		public T acceleration(double xAcc, double yAcc) {
			this.xAcc = xAcc;
			this.yAcc = yAcc;

			return self();
		}

		protected abstract T self();

		public abstract Vehicle build();
	}
}
