
public class SinCalc implements Runnable{
	double[]  arr;
	int length;
	public SinCalc(double[] val, int length) {
		arr = val;
		this.length = length;
	}
	@Override
	public void run() {
		for (int i = 0; i < length; i++) {
			double radian = i * 180 / Math.PI;
			arr[i] = Math.sin(radian);		}
	}
}

