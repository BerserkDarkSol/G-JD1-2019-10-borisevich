package classwork.lesson13.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		for (int i = 0; i < 200; i++) {
			CounterThread ct = new CounterThread(counter);
			ct.start();
		}

		Thread.sleep(1000);
		System.out.println("Counter: " + counter.getCounter());
	}

	static class Counter {
		private AtomicInteger counter = new AtomicInteger(0);

		public void increaseCounter() {
			counter.incrementAndGet();

		}

		public AtomicInteger getCounter() {
			return counter;
		}

	}

	static class CounterThread extends Thread {
		private Counter counter;

		public CounterThread(Counter counter) {
			this.counter = counter;
		}

		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				counter.increaseCounter();

			}
		}

	}

}