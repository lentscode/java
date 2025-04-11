package es8;

public abstract class MotorVehicle extends Vehicle {
	private final int cc;

	protected MotorVehicle(Builder<?> builder) {
		super(builder);

		cc = builder.cc;
	}

	public static abstract class Builder<T extends Builder<T>> extends Vehicle.Builder<T> {
		private int cc;

		public T cc(int cc) {
			this.cc = cc;

			return self();
		}
	}
}
