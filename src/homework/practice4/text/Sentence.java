package homework.practice4.text;

import java.util.List;

public class Sentence {

	private List<Word> words;

    public Sentence(List<Word> words) {
        this.words = words;
    }

    public List<Word> getWords() {
        return words;
    }

    public void printSentence() {
        for (int i = 0; i < words.size() - 1; i++) {
            words.get(i).printWord();
            System.out.print(" ");
        }
        words.get(words.size() - 1).printWord();
        System.out.print(".");
    }
	
}
