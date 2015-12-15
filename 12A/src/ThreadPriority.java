
public class ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread(1, false);
		t1.setPriority(1);
		MyThread t2 = new MyThread(2, false);
		t2.setPriority(3);
		MyThread t3 = new MyThread(3, false);
		t3.setPriority(5);
		MyThread t4 = new MyThread(4, true);
		t4.setPriority(7);
		MyThread t5 = new MyThread(5, true);
		t5.setPriority(9);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		if (t1.isAlive()) {
			System.out.println("Thread 1 alive");
		}
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}