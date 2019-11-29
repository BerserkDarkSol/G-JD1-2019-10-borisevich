package homework.multithreading;

public class VolatileTesting {
	// volatile
	private static int MY_INT = 0;

	public static void main(String[] args) {
		new ChangeListener().start();
		new ChangeMaker().start();
	}

	static class ChangeListener extends Thread {
		@Override
		public void run() {
			int localValue = MY_INT;
			while (localValue < 5) {// read variable from memory in infinite loop (as frequent as possible)
				if (localValue != MY_INT) {
					System.out.println("Got Change for MY_INT :" + MY_INT);
					localValue = MY_INT;
				}
			}
		}
	}

	static class ChangeMaker extends Thread {
		@Override
		public void run() {
			int localValue = MY_INT;
			while (MY_INT < 5) { // every 500ms increment variable (5 times)
				localValue++;
				System.out.println("Incrementing MY_INT to:" + localValue);
				MY_INT = localValue;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}