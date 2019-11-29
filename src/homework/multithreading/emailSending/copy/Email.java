package homework.multithreading.emailSending.copy;

public class Email {

	private static final int EMAIL_LIMIT = 50;

	private static int COUNTER = 0;

	private int number;
	
	// if execute then not call Email()
	public Email() {
		synchronized (Email.class) {
			if (number >= EMAIL_LIMIT) {
				throw new IllegalArgumentException();
			} // if execute then not call Email()
			number = COUNTER++;

			if (number == EMAIL_LIMIT) {
				Task.LIMIT_REACHED = true;
			}
		}

	}

	@Override
	public String toString() {
		return "email#" + number;
	}
}