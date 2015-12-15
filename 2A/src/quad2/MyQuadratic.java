package quad2;
import quad1.Quadratic;
public class MyQuadratic implements Quadratic{

	@Override
	public double getDiscriminant(int a, int b, int c) {
		double d = Math.pow(b, 2) - 4 * a * c;
		return d;
	}

	@Override
	public void getRoots(int a, int b, int c) {
		double d2 = Math.sqrt(getDiscriminant(a, b, c));
		double x1 = (-b + d2) / 2 * a;
		double x2 = (-b - d2) / 2 * a;
		System.out.println("Root 1: " +  x1 + " Root 2: " + x2);
	}
	
	public static void main(String args[]) {
		MyQuadratic quad = new MyQuadratic();
		quad.getRoots(1,2,1);
	}
	

}
