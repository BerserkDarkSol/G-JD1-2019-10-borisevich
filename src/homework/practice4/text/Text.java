package homework.practice4.text;

import java.util.List;

public class Text {

	private String title;

	private List<Sentence> sentences;

	public Text(List<Sentence> sentences) {
		this.sentences = sentences;
	}

	public Text() {
	}

	public void printText() {
		System.out.println(title);
		for (int i = 0; i < sentences.size(); i++) {
			sentences.get(i).printSentence();
			System.out.print(" ");
		}
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
