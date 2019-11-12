package homework.practice4;

public class Text {

	Sentence dsfadsfa = new Sentence();
	String newText[] = dsfadsfa.newSentence;

	public static void main(String[] args) {

		Text mainTextObject = new Text();
		String[] localTextObject = mainTextObject.newText;

		for (int i = 0; i < localTextObject.length; i++) {
			System.out.println(localTextObject[i] + " ");
		}
	}
}

class Sentence {

	Words sentenceTextObject = new Words();
	String newSentence[] = { sentenceTextObject.newWords1, sentenceTextObject.newWords2, sentenceTextObject.newWords3,
			sentenceTextObject.newWords4 };

}

class Words {

	String newWords1 = "one";
	String newWords2 = "two";
	String newWords3 = "three";
	String newWords4 = "four";

}