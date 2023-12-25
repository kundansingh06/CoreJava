package section15;

class Brackets {

	 synchronized public void generate() {

		for (int i = 1; i <= 10; i++) {

			if (i <= 5) {
				System.out.print("[");
			} else {
				System.out.print("]");
			}
		}
		System.out.println();
	}

}

public class SynchronizationMethod {

	public static void main(String[] args) {

		Brackets bracket = new Brackets();

		// anonymous thread
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					bracket.generate();
				}
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					bracket.generate();
				}
			}
		}).start();
	}

}
