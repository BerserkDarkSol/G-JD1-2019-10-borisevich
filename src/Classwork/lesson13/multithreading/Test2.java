package classwork.lesson13.multithreading;

public class Test2 {
	public static class HelloRunnable implements Runnable {
		@Override
		public void run() {
			System.out.println("Hello from a thread");
		}
	}

	public static void main(String[] args) {
		HelloRunnable helloRunnable = new HelloRunnable();
		System.out.println("Create new thread");
		Thread thread = new Thread(helloRunnable);
		System.out.println("before new thread start");
		thread.run();
		System.out.println("after new thread start");
	}

}
