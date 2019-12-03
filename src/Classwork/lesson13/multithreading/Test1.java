package classwork.lesson13.multithreading;

public class Test1 {

	public static class HelloThread extends Thread {
		@Override
		public void run() {
			System.out.println("Hello from a thread");
		}

	}

	public static void main(String[] args) {
		HelloThread helloThread = new HelloThread();
		helloThread.start();

	}

}
