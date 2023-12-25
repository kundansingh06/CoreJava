package section15;
public class BeforeSynchronizationDemo {
	public static int counter = 0; // this is not synchronized
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 2000; i++) {
					BeforeSynchronizationDemo.counter++;
				}
				System.out.println("the loop in thread1 is over");
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 1200; i++) {
					BeforeSynchronizationDemo.counter--;
				}
				System.out.println("the loop in thread2 is over");
			}
		});
		thread1.start();
		thread2.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(BeforeSynchronizationDemo.counter);
	}
}
