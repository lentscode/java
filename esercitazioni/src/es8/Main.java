package es8;

class Main {
	public static void main(String[] args) {
		final Moped mop = new Moped.Builder()
			.initialPosition(5, 3)
			.initialSpeed(4.2, -2.6)
			.acceleration(-1.5, 5.3)
			.chassisNumber(3432)
			.build();

		final Car car = new Car.Builder()
			.initialPosition(-2, 8)
			.initialSpeed(1.5, -0.6)
			.acceleration(4.5, 0.9)
			.numberPlate("CIAO")
			.build();

		final Bicycle bicycle = new Bicycle.Builder()
			.initialPosition(-2.2, 4.2)
			.initialSpeed(5.2, 0.4)
			.model("Ciao")
			.build();

		final Vehicle[] vehicles = new Vehicle[]{
			mop,
			car,
			bicycle
		};

		for (int i = 0; i < 10; i++) {
			for (Vehicle vehicle : vehicles) {
				vehicle.move(i);
			}
		}
	}
}
