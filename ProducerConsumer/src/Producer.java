
public class Producer extends Thread {
	Element e;
	public Producer(Element e) {
		this.e = e;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			e.set(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}
		
}
