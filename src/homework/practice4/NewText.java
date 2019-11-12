package homework.practice4;

import java.util.ArrayList;
import java.util.List;

public class NewText {

	String title;
	String[] text;

	public static void main(String[] args) {

		String text = "hello world. new world";
		String[] sentence = text.split("[.]+");
		String[] words = text.trim().split("[^a-zA-Z]+");
		

		List<String> a = new ArrayList<String>();

		// NewText a = new NewText();
		Sent b = new Sent();
		Word c = new Word("sdfsdfdsf");

	}

}

class Sent {
	String[] predlozhenie;

	public Sent() {

	}

}

class Word {

	String slovo;

	public Word(String slovo) {
		this.slovo = slovo;
	}
}
