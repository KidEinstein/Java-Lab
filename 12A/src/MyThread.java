
public class MyThread extends Thread {
	int threadNum;
	boolean sleep;
	
	public MyThread(int num, boolean sleep) {
		threadNum = num;
		this.sleep = sleep;
	}
	@Override
	public void run() {
		System.out.println("Executing thread " + threadNum);
		if (sleep) {
			try {
				System.out.println("Sleeping " + threadNum + " for 1 sec");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
