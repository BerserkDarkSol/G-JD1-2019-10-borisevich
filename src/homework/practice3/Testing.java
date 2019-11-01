package homework.practice3;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Testing {

	public static void main(String[] args) {

//		Pattern p = Pattern.compile(" +- +");
//		Matcher matcher = p.matcher("Test - string - test");
//		while (matcher.find()) {
//			System.out.println(matcher.start() + " " + matcher.end());
//		}
		String text = "asdasd asdda dwdad asdda dwdad dwdad asdda dwdad";
		String words[] = text.split("[^a-zA-Z]+");
		String newtext = "";
		int lenthOfNewArray = 0;
		for (int i = 0; i < words.length; i++) {
			char firstLetter = words[i].charAt(0);
			char lastLetter = words[i].charAt(words[i].length() - 1);
			if (firstLetter == lastLetter) {
				lenthOfNewArray++;
				newtext = text.replace(words[i], " ");
			}
		}
		System.out.println(newtext);
		
		String newWords[] = new String[lenthOfNewArray];
		int j = 0;
		for (int i = 0; i < words.length; i++) {
			char firstLetter = words[i].charAt(0);
			char lastLetter = words[i].charAt(words[i].length() - 1);
			if (firstLetter == lastLetter) {
				newWords[j] = words[i];
				//System.out.println(newWords[j]);
				j++;
			}
			System.out.println();
		}
		

		
//		String text1 = "asdasd asdda dwdad asdda";
//		String asd = "asdda";
//		String content = text1.replace(asd, "");
//		System.out.println(content);

	}

}
