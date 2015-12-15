
public class Element {
	int x;
	boolean consumed = true;
	synchronized void set(int x) {
		if (!consumed) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.x = x;
		System.out.println("Set: " + x);
		consumed = false;
		notify();
	}
	
	synchronized void get() {
		if (consumed) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Get: " + x);
		consumed = true;
		notify();
	}
}
