package classwork.lesson15_Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExamples {

	public static void main(String[] args) {

		ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(10);

		scheduledExecutor.schedule(new Callable<String>() {
			@Override
			public String call() throws Exception {
				System.out.println("Executed after delay!");
				return "Called";
			}

		}, 2, TimeUnit.SECONDS);

		Runnable command = new Runnable() {

			@Override
			public void run() {
				System.out.println("Executed periodically!");
			}
		};
		scheduledExecutor.scheduleAtFixedRate(command, 4, 2, TimeUnit.SECONDS);
	}

}
