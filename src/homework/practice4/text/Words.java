package homework.practice4.text;

class Words extends Text {

	Text words = new Text();

	static void devideTextByWords() {

		String words[] = text.split("[^a-zA-z]+");
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");

		}
	}

}