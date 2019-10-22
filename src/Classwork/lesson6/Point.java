package Classwork.lesson6;

public class Point {

	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
		this(-1, -1); // конструктор вызывает другой
	}
}
