package homework.multithreading;

public class Test {

	private static class SleepingThread extends Thread {
		public SleepingThread(String name) {
			super(name);
		}

		@Override
		public void run() {
			while (true) {
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) {
		int threadCount = 0;
		long startTime = System.currentTimeMillis();
		while (true) {
			if (System.currentTimeMillis() - startTime < 5000) {
				continue;

			}
			new SleepingThread("SleepingThread" + (++threadCount)).start();
			startTime = System.currentTimeMillis();
		}
	}

}
