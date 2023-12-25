package section14;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedBlockingQueue<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(43);
		for (Integer n : queue) {
			System.out.println(n);
		}
		System.out.println("\n-------------------");
		Queue<Integer> arrayQueue = new ArrayBlockingQueue<>(3);
		try {
			arrayQueue.add(1);
			arrayQueue.add(2);
			arrayQueue.add(3);
			arrayQueue.add(43); // queue full
		} catch (IllegalStateException e) {
			System.out.println("queue is Full\n");
		}
		for (Integer n : arrayQueue) {
			System.out.println(n);
		}
	}
}
