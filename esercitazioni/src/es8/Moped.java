package es8;

public class Moped extends MotorVehicle {
	private final long chassisN;

	protected Moped(Builder builder) {
		super(builder);

		chassisN = builder.chassisN;
	}

	public static class Builder extends MotorVehicle.Builder<Builder> {
		private long chassisN;

		public Builder chassisNumber(long n) {
			chassisN = n;

			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		@Override
		public Moped build() {
			return new Moped(this);	
		}
	} 
}
