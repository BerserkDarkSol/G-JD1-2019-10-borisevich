package homework.multithreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class MyEmailSending {

	private static final Random RND = new Random();

	public static void main(String[] args) {

		Queue<Consumer> consumerQueue = new LinkedList<Consumer>();

		for (int i = 0; i < RND.nextInt(1) + 3; i++) {
			Consumer consumer = new Consumer("email was write");
			consumer.start();
			consumerQueue.add(consumer);
		}

		for (int i = 0; i < RND.nextInt(2) + 3; i++) {
			Producer producer = new Producer("email was send");
			producer.start();
			consumerQueue.remove(producer);
		}

	}

	static class Consumer extends Thread {
		private Consumer(String email) {
			super(email);
		}

	}

	static class Producer extends Thread {
		private Producer(String email) {
			super(email);
		}
	}

}
