
public class Main {
	public static void main(String args[]) {
		double[] sinArr = new double[100];
		double[] cosArr = new double[100];
		double[] tanArr = new double[100];
		double[] resultsArr = new double[100];
		SinCalc sc = new SinCalc(sinArr, 100);
		CosCalc cc = new CosCalc(cosArr, 100);
		TanCalc tc = new TanCalc(tanArr, 100);
		Thread t1 = new Thread(sc);
		Thread t2 = new Thread(cc);
		Thread t3 = new Thread(tc);
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 100; i++) {
			resultsArr[i] = sinArr[i] + cosArr[i] + tanArr[i];
			System.out.println(i + ": " + resultsArr[i]);
		}
	}
}
