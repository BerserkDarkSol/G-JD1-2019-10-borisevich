package homework.practice4.text;

class Sentence extends Text {

	Text sentence = new Text();

	static void devideTextBySentences() {

		String sentences[] = text.split("[.]+");
		for (int i = 0; i < sentences.length; i++) {
			System.out.println(sentences[i]);

		}
	}

}