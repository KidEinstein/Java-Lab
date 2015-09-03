
public abstract class TwoDShape 
{ 
	private double width;
	private double height;
	private static int shapeCount;
	
	public TwoDShape() 
	{ 
		this.width = 0.0; 
		this.height = 0.0; 
		shapeCount++; 
	} 

	public TwoDShape(double width, double height) 
	{ 
		this.width = width;  
		this.height = height;
		shapeCount++; 
	} 
	public double getWidth() 
	{ 
		return width; 
	} 
	public double getHeight() 
	{ 
		return height; 
	} 
	public String toString() 
	{ 
		return "Width is " + width + " Height is " + height;  
	}
	public void setWidth(double width) 
	{ 
		 this.width = width;
	} 
	public void setHeight(double height) 
	{ 
		this.height = height; 
	}
	public void printShapeCount() 
	{ 
	System.out.println("Number of shapes created is " + shapeCount); 
	}
	public abstract double area();
} 

