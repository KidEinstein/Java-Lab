
public class Rectangle extends TwoDShape{
	public Rectangle(double width, double height) {
		super(width, height);
	}
	
	public String toString() {
		return "Shape is rectangle" + super.toString();
	}
	
	public double area() {
		return getWidth() * getHeight();
	}
	
	public void printType() {
		System.out.println("Rectangle");
	}
}	
