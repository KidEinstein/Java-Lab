
public class Circle extends TwoDShape{
	public Circle(int radius) {
		super(radius, 0);
	}
	@Override
	public double area() {
		return Math.PI * Math.pow(getWidth(), 2);
	}
	
	@Override
	public String toString() {
		return "Shape is circle \nRadius: " + getWidth();
	}
}
