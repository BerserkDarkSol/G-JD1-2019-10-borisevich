package homework.practice4.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Executor {

	public static void main(String[] args) {

		List<Sentence> sentences = new ArrayList<>();
		List<Word> words = new ArrayList<>();
		String text = "Once upon a time in the cold winter time";
		String textWords[] = text.split("[^a-zA-Z]+");
		words = new ArrayList<>();
		for (int i = 0; i < textWords.length; i++) {
			words.add(new Word(textWords[i]));
		}
		sentences.add(new Sentence(words));

		Scanner in = new Scanner(System.in);
		String newText = in.nextLine();
		String newTextWords[] = newText.split("[^a-zA-Z]+");

		words = new ArrayList<>();
		for (int i = 0; i < newTextWords.length; i++) {
			words.add(new Word(newTextWords[i]));
		}

		sentences.add(new Sentence(words));

		Text userText = new Text(sentences);
		userText.printText();

	}

}
