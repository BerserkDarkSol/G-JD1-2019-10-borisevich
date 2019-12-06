package classwork.lesson17.Streams;

import java.util.Arrays;
import java.util.Collection;

public class Task {
	private enum Status {OPEN, CLOSED};
	
	private final Status status;
	private final Integer points;
	
	public Task(final Status status, final Integer points) {
		this.status = status;
		this.points = points;
	}
	
	public Status getStatus() {
		return status;
	}


	public Integer getPoints() {
		return points;
	}
	
	public static void main(String[] args) {

		final Collection<Task> tasks = Arrays.asList(
				new Task(Status.OPEN, 5),
				new Task(Status.OPEN, 13),
				new Task(Status.CLOSED, 8));
		
		final long totalPointsOpenTasks = tasks
				.stream()
				.parallel()
				.filter(task -> task.getStatus() == Status.OPEN)
				.mapToInt(Task::getPoints)
				.sum();
		
		System.out.printf("Total points: %s", totalPointsOpenTasks);
	}

}
