
public class Triangle extends TwoDShape{
	private String style;

	public Triangle(String style, double width, double height) {
		super(width, height);
		this.style = style;
	}
	
	public double area() {
		return getWidth() * getHeight() / 2;
	}
	
	public String getStyle() {
		return style;
	}
	
	public void printStyle() {
		System.out.println(style);
	}
	
	public String toString() 
	{ 
	return "The triangle is " + style + super.toString(); 
	} 
	
	
}
