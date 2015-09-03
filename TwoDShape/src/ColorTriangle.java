
public class ColorTriangle extends Triangle{
	private String color;
	
	public ColorTriangle(String color, String style, double width, double height) {
		super(style, width, height);
		this.color = color;
	}
	
	public String toString() {
		return "Color is " + color + super.toString();
	}
}
