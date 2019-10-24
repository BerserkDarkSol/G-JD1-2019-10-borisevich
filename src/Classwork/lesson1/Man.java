package classwork.lesson1;

public class Man {
	public Man(int hairLength) {
		this.hairLength = hairLength;
	}

	int hairLength;
	
	public Man() {
		hairLength = 10;
	}

	void increaseHair() {
		hairLength = hairLength + 1;
	}
}