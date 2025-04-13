package es8;

public class Car extends MotorVehicle {
	private final String nPlate;

	protected Car(Builder builder) {
		super(builder);

		nPlate = builder.nPlate;
	}

	public String getNumberPlate() {
		return nPlate;
	}

	public static class Builder extends MotorVehicle.Builder<Builder> {
		private String nPlate;

		public Builder numberPlate(String plate) {
			nPlate = plate;

			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		@Override
		public Car build() {
			return new Car(this);
		}
	}
}
