
public class PolymorphicReporter {
	public void outputArea(TwoDShape shape) {
		System.out.println("Area:" + shape.area());
	}
	public void outputDetails( TwoDShape shape) 
	{ 
		System.out.println(shape.toString()); 
		System.out.println(); 
	} 
	public static void main(String[] args) {
		PolymorphicReporter pr = new PolymorphicReporter();
		Triangle tri = new Triangle("Scalene", 10, 20);
		pr.outputDetails(tri);
		pr.outputArea(tri);
	}
}
