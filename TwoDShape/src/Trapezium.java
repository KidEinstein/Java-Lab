
public class Trapezium extends TwoDShape{
	int topWidth;
	public Trapezium(int bottomWidth, int topWidth, int height) {
		super(bottomWidth, height);
		this.topWidth = topWidth;
	}
	
	public double area() {
		return (topWidth + getWidth()) / 2 * getHeight();
	}
	
	@Override
	public String toString() {
		return "Top Width: " + topWidth + " Bottom Width: " + getWidth() + " Height: " + getHeight();
	}
}
