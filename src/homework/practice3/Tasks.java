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

		changeTheLetter(text, numberOftheSymbol, newSymbol);

		printWordWithEqualFirstAndLastLetter(text);

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
			System.out.println(words[i]);
		}
		String newWords[] = new String[lenthOfNewArray];
		for (int i = 0; i < newWords.length; i++) {
			char firstLetter = words[i].charAt(0);
			char lastLetter = words[i].charAt(words[i].length() - 1);
			if (firstLetter == lastLetter) {
			
			}
			System.out.println();
			System.out.println(newWords[i]);
		}

	}

}