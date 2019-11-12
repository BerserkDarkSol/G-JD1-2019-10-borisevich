package homework.practice4.text;

import java.util.ArrayList;
import java.util.List;

public class Executor {

	Text text = new Text();
	static Sentence sentence = new Sentence();
	static Words words = new Words();
	
	List <Text> newText = new ArrayList<Text>();
	
	
	

	public static void main(String[] args) {

		Sentence.devideTextBySentences();
		Words.devideTextByWords();

	}

}
