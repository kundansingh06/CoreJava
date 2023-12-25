package section15;
import java.util.Random;
class MyCounter2 implements Runnable {
	private int threadNo;
	public MyCounter2(int threadNo) {
		this.threadNo = threadNo;
	}
	@Override
	public void run() {
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(random.nextInt(500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("the value of i is :" + i + " thread no: " + threadNo);
		}
	}
}
public class ThreadingDemo2 {
	public static void main(String[] args) {
		/*
		 * Thread thread = new Thread(new MyCounter2(1));
		 * Thread thread2 = new Thread(new MyCounter2(2));
		 * thread.run();
		 * thread2.run();
		 */
		// another way of creating thread, anonymous way
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(900);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (int i = 0; i < 10; i++) {
					System.out.println(i);
				}
			}
		}).start();
	}
}
