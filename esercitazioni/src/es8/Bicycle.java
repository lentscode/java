package es8;

public class Bicycle extends Vehicle {
  private final String model;

  protected Bicycle(Builder builder) {
    super(builder);

    model = builder.model;
  }

  @Override
  public void move(double t) {
    final double x = super.initialX() + super.initialXSpeed() * t;

    final String output = String.format(
			"Time: %.2f, Position: (%.2f, 0.0)",
			t,
			x
		);

    System.out.println(output);
  }

  public static class Builder extends Vehicle.Builder<Builder> {
    private String model;

    public Builder model(String model) {
      this.model = model;

      return this;
    }

    @Override
    protected Builder self() {
      return this;
    }

    @Override
    public Bicycle build() {
      return new Bicycle(this);
    }     
  }
}
