package homework.practice4;

public class NewText {

	String title;
	String[] text;

	public static void main(String[] args) {
		NewText a = new NewText();
		Sent b = new Sent();
		Word c = new Word("sdfsdfdsf");

	}

}

class Sent {
	String[] predlozhenie;

}

class Word {

	String slovo;

	public Word(String slovo) {
		this.slovo = slovo;
	}
}