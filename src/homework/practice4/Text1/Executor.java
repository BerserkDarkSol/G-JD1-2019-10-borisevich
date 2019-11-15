package homework.practice4.Text1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Executor {

	Scanner userText = new Scanner(System.in);
	String numberOftheSymbol = userText.toString();

	List<Text> newText = new ArrayList<Text>();

	public static void main(String[] args) {
		String text = "Lorem ipsum dolor sit amet. Consectetur adipiscing elit. ";

		Word word1 = new Word();
		word1.setValue("asdasd");
		

		Sentence sentence = new Sentence();
		sentence.getWords().add(word1);
		List<Word> a = sentence.getWords();
		a.add(word1);
		System.out.println(a.get(0));

		List<String> myText = new ArrayList<>();
		myText.add(text);
		String res = myText.get(0);
		for (int i = 0; i < myText.size(); i++) {
			//System.out.print(myText.get(i));
		}
		
		
	}
}
