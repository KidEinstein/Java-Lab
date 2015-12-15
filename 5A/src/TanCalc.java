
public class TanCalc implements Runnable{
	double[]  arr;
	int length;
	public TanCalc(double[] val, int lenght) {
		arr = val;
		this.length = lenght;
	}
	@Override
	public void run() {
		for (int i = 0; i < length; i++) {
			double radian = i * Math.PI / 180;
			arr[i] = Math.tan(radian);
		}
	}
}
