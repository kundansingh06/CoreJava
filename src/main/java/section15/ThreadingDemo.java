package section15;
class MyCounter extends Thread {
	private int threadNo;
	public MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}
	@Override
	public void run() {
		countMe();
	}
	public void countMe() {
		for (int i = 0; i < 10; i++) {
			try {
				sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The value of i is: " + i + ", thread no: " + threadNo);
		}
	}
}

public class ThreadingDemo {
	public static void main(String[] args) {
		MyCounter counter1 = new MyCounter(1);
		MyCounter counter2 = new MyCounter(2);
		long startTime = System.currentTimeMillis();
		/*
		 * counter1.countMe();
		 * now instead of calling countMe() method directly, we call the run() method
		 * from Thread class.
		 * run() method should be called by the JVM instead of us calling it ourselves.
		 */
		// counter1.run(); // it should be called by JVM so rather we call the start()
		counter1.start();
		// counter2.countMe();
		// counter2.run(); // calling start method rather than run
		counter2.start();
		try {
			Thread.sleep(4100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("---------------------------------------------------------------");
		System.out.println("\nTotal time taken: " + (endTime - startTime) + " seconds.");
	}

}
