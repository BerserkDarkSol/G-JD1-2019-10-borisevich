package classwork.lesson13.multithreading;

class ExceptThread extends Thread {
	@Override
	public void run() {
		boolean flag = true;
		if (flag) {
			throw new RuntimeException();
		}
		System.out.println("end of EceptThread");
	}
}

public class ExceptionThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		new ExceptThread().start();
		Thread.sleep(1000);
		System.out.println("end of main");
	}
}