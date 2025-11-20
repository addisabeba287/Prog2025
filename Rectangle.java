package firstOne;

public class Rectangle implements IShape {

	private double length;
	private double height;

	public Rectangle(double length, double height) {
		this.length = length;
		this.height = height;
	}

	@Override
	public double area() {
		return length * height;
	}

}
