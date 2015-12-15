
public class Main {
	public static void main(String[] args) {
		Element e = new Element();
		Producer p = new Producer(e);
		Consumer c = new Consumer(e);
		p.start();
		c.start();
		try {
			p.join();
			c.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
