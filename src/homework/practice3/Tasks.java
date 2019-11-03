package homework.practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) throws Exception {

		String text = readFromUrl("http://25.io/toau/audio/sample.txt");
		System.out.println(text);

		System.out.println();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of the symbol that you want to be changed");
		int numberOftheSymbol = in.nextInt();
		System.out.println("Enter the symbol you want to change to");
		String newSymbol = in.next();
		System.out.println("Enter a number that will display most used letters in the text");
		int quantityMostUsedLetters = in.nextInt();

		changeTheLetter(text, numberOftheSymbol, newSymbol);
		printMostUsedLetters(text, quantityMostUsedLetters);
		printWordWithEqualFirstAndLastLetter(text);
		findMaxAndMinWordsLength(text);
	}

	private static String readFromUrl(final String url) throws MalformedURLException, IOException, ProtocolException {
		final URL obj = new URL(url);
		final HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

		connection.setRequestMethod("GET");
		String string = null;
		try (final BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));) {
			String inputLine;
			final StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
				string = response.toString();
			}
		}
		return string;
	}

	private static void changeTheLetter(String text, int numberOftheSymbol, String newSymbol) {
		String words[] = text.split("[^a-zA-Z]+");
		for (int i = 0; i < words.length; i++) {
			if (numberOftheSymbol > words[i].length()) {
				continue;
			} else {
				String changeWords = words[i].substring(0, (numberOftheSymbol - 1)) + newSymbol
						+ words[i].substring(numberOftheSymbol);
				System.out.println(changeWords);
			}
		}
	}

	private static void printWordWithEqualFirstAndLastLetter(String text) {
		int lenthOfNewArray = 0;
		String words[] = text.split("[^a-zA-Z]+");

		for (int i = 0; i < words.length; i++) {
			char firstLetter = words[i].charAt(0);
			char lastLetter = words[i].charAt(words[i].length() - 1);
			if (firstLetter == lastLetter) {
				lenthOfNewArray++;
			}
		}
		String newWords[] = new String[lenthOfNewArray + 1];
		int newIndex = 0;
		for (int i = 0; i < words.length; i++) {
			char firstLetter = words[i].charAt(0);
			char lastLetter = words[i].charAt(words[i].length() - 1);
			if (firstLetter == lastLetter) {
				newWords[newIndex] = words[i];
				newIndex++;
			}
		}

		for (int i = 0; i < newWords.length; i++) {
			for (int j = i + 1; j < newWords.length; j++) {
				if (newWords[i].equals(newWords[j])) {
					newWords[j] = newWords[j].replace(newWords[j], "0");
				}
			}
		}

		for (int i = 0; i < newWords.length; i++) {
			if (newWords[i] == null || newWords[i].equals("0")) {
				continue;
			} else {
				System.out.println(newWords[i]);
			}
		}
	}

	private static void findMaxAndMinWordsLength(String text) {
		String words[] = text.split("[^a-zA-Z]+");
		int max = words[0].length();
		int min = words[0].length();
		for (int i = 0; i < words.length; i++) {
			if (max < words[i].length()) {
				max = words[i].length();
			}
			if (min > words[i].length()) {
				min = words[i].length();
			}
		}

		for (int i = 0; i < words.length; i++) {
			if (words[i].length() == max) {
				System.out.println(words[i]);
			} else if (words[i].length() == min) {
				System.out.println(words[i]);
			}
		}
	}

	private static void printMostUsedLetters(String text, int quantityMostUsedLetters) {

		String strippedText = text.replaceAll("[^a-zA-Z]+", "");
		char allLettersInText[] = new char[strippedText.length()];
		char eachLetter[] = new char[strippedText.length()];
		int countOfEachLetter[] = new int[strippedText.length()];
		
		for (int i = 0; i < allLettersInText.length; i++) {
			allLettersInText[i] = Character.toLowerCase(strippedText.charAt(i));
		}

		for (int i = 0; i < allLettersInText.length; i++) {
			int countLetter = 1;
			for (int j = i + 1; j < allLettersInText.length; j++) {
				if (allLettersInText[i] == '0') {
					continue;
				} else if (allLettersInText[i] == (allLettersInText[j])) {
					eachLetter[i] = allLettersInText[i];
					allLettersInText[j] = '0';
					countLetter++;
					countOfEachLetter[i] = countLetter;
				} else if (allLettersInText[i] != (allLettersInText[j])) {
					eachLetter[i] = allLettersInText[i];
					countOfEachLetter[i] = countLetter;
				} else if (i == allLettersInText.length && allLettersInText[i] != '0') {
					eachLetter[i] = allLettersInText[i];
					countOfEachLetter[i] = countLetter;
				}
			}
		}

		if (quantityMostUsedLetters > countOfEachLetter.length) {
			System.out.println("Enter the number that less than letter quantity in the text");
		} else {
			for (int i = 0; i < quantityMostUsedLetters; i++) {
				int countLetterQuantity = 0;
				int max = foundMaxUsedLetter(countOfEachLetter);
				for (int j = 0; j < countOfEachLetter.length; j++) {
					if (countLetterQuantity == quantityMostUsedLetters + 1) {
						break;
					}
					if (max == countOfEachLetter[j] && countOfEachLetter[j] != 0) {
						System.out.println(eachLetter[j] + " - " + countOfEachLetter[j]);
						countOfEachLetter[j] = 0;
						countLetterQuantity++;
					}
				}
			}
		}

	}

	private static int foundMaxUsedLetter(int[] countOfEachLetter) {
		int max = 0;
		for (int i = 0; i < countOfEachLetter.length; i++) {
			if (max < countOfEachLetter[i]) {
				max = countOfEachLetter[i];
			}
		}
		return max;
	}

}