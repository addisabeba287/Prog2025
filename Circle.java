package firstOne;

public class Circle implements IShape {

	private double radius;
	private final double PI = 3.14;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return PI * radius * radius;
	}

}
